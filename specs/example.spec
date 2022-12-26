Getting Started with Gauge
==========================

This is an executable specification file. This file follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.
To execute this specification, use `mvn test`


FlyPgsTest
----------
* "2" saniye kadar bekle
* Tanıtım ekranını geç
* "3" saniye kadar bekle
* "com.m.qr:id/onboarding_skip_button" li elemente tıkla
* "2" saniye kadar bekle
* "com.m.qr:id/push_consent_decline" li elemente tıkla
* "2" saniye kadar bekle
* "com.m.qr:id/nav_menu_book" li elemente tıkla
* "3" saniye kadar bekle
* "//android.widget.LinearLayout[@content-desc='One-way']" xpath li elemente tıkla
* "3" saniye kadar bekle
* "com.m.qr:id/rvmp_fragment_rtow_flight_selection_destination_holder_city_name_text_view" li elemente tıkla
* "//*[@resource-id='com.m.qr:id/rvmp_fragment_ond_selection_filter_textinputlayout']/android.widget.FrameLayout/android.widget.EditText" li elemente "Berlin" text değerini yaz
* "3" saniye kadar bekle
* "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout" xpath li elemente tıkla
* "3" saniye kadar bekle
* "com.m.qr:id/rvmp_fragment_rtow_flight_selection_destination_select_destination_text_view" li elemente tıkla
* "3" saniye kadar bekle
* "//*[@resource-id='com.m.qr:id/rvmp_fragment_ond_selection_filter_textinputlayout']/android.widget.FrameLayout/android.widget.EditText" li elemente "Istanbul" text değerini yaz
* "3" saniye kadar bekle
* "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout" xpath li elemente tıkla
* "3" saniye kadar bekle
* "//*[@resource-id='com.m.qr:id/rvmp_fragment_rtow_flight_selection_departure_date_holder']" xpath li elemente tıkla
* "3" saniye kadar bekle
* "(//android.widget.TextView[@clickable='true'])[1]" xpath li elemente tıkla
* "2" saniye kadar bekle
* 7 gün sonrası seçim
* "3" saniye kadar bekle
* "//*[@resource-id='com.m.qr:id/fragment_calendar_confirm_button']" xpath li elemente tıkla
* "3" saniye kadar bekle
* "//*[@resource-id='com.m.qr:id/rvmp_booking_search_flights_button']" xpath li elemente tıkla
* "3" saniye kadar bekle
* "com.m.qr:id/rvmp_fare_message" 'li id ekranın görünür olup olmadığını kontrol et
* Sayfayı yukarı kaydır
* "3" saniye kadar bekle
* "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup" 'li uçuşlardan rastgele uçuş seç ve "android.widget.TextView[1]" , "android.widget.TextView[2]" ile kaydet
* "5" saniye kadar bekle
* "//*[@resource-id='com.m.qr:id/rvmp_activity_flight_details_select_button']" xpath li elemente tıkla
* "12" saniye kadar bekle
* "//*[@resource-id='com.m.qr:id/baggage_text']" xpath li elemente tıkla

* "10" saniye kadar bekle
