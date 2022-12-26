import com.thoughtworks.gauge.Logger;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import java.util.Random;


public class StepImplementation extends BaseTest {
    Random rnd = new Random();
    String beforeDepartureTime, afterDepartureTime, beforeArrivalTime, afterArrivalTime;

    @Step("<x> saniye kadar bekle")
    public void waitForSecods(int x) throws InterruptedException {
        Thread.sleep(1000*x);
    }

    @Step("Tanıtım ekranını geç")
    public void SkipCokkie(){
        MobileElement element = appiumDriver.findElement(By.id("com.m.qr:id/skip_button"));
        if (element.isDisplayed()){
            System.out.println("Tanım ekranı görünür oldu");
            element.click();
        }else{
            System.out.println("Tanım ekranı görünür olmadı");

        }


    }
    @Step("<id> id li element <text> text değerini içeriyo mu  kontrol et")
    public void assertByid(String id ,String text){
        MobileElement element = appiumDriver.findElement(By.id(id));
        Assert.assertTrue(element.getText()+"text değeri ile verilen değer birbirini tutmuyor",element.getText().equals(text));
    }
    @Step("<id> li elemente tıkla")
    public void clickByid(String id){
        appiumDriver.findElement(By.id(id)).click();
    }
    @Step("<xpath> xpath li elemente tıkla")
    public void clickByxpath(String xpath){
        appiumDriver.findElement(By.xpath(xpath)).click();
    }
    @Step("<xpath> li elemente <value> text değerini yaz")
    public void sendKeyByxpath(String xpath ,String value){
        MobileElement element = appiumDriver.findElement(By.xpath(xpath));
        element.clear();
        element.sendKeys(value);
    }



    @Step("Debug yap")
    public void debugStep() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Step("Sayfayı yukarı kaydır")
    public void SwipeUp(){
        final int ANIMATION_TIME = 200; // ms

        final int PRESS_TIME = 200; // ms

        int edgeBorder = 300; // better avoid edges
        PointOption pointOptionStart, pointOptionEnd;
        Dimension dims = appiumDriver.manage().window().getSize();
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
        pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
        new TouchAction(appiumDriver)
                .press(pointOptionStart)
                // a bit more reliable when we add small wait
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                .moveTo(pointOptionEnd)
                .release().perform();
    }

    @Step("<xpath> 'li uçuşlardan rastgele uçuş seç ve <departure> , <arrival> ile kaydet")
    public void randomSelectFly(String xpath, String departurePath, String arrivalPath) {

        int random = rnd.nextInt(4);
        if (random==0){
            random = random+1;
        }
        System.out.println("random: "+random);
        MobileElement departure = appiumDriver.findElement(By.xpath("("+xpath+")["+random+"]/"+departurePath+""));
        beforeDepartureTime = departure.getAttribute("text");
        MobileElement arrival = appiumDriver.findElement(By.xpath("("+xpath+")["+random+"]/"+arrivalPath+""));
        beforeArrivalTime = arrival.getAttribute("text");

        MobileElement element = appiumDriver.findElement(By.xpath("("+xpath+")["+random+"]"));
        element.click();
        Logger logger = null;
        logger.info("Rastgele ucus secimi basarili.");
    }

    @Step("7 gün sonrası seçim")
    public void plus7Days() {
        new Actions(appiumDriver)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();
        Logger logger = null;
        logger.info("Tarih seçimi başarılı");

    }

    @Step("<id> 'li id ekranın görünür olup olmadığını kontrol et")
    public void isDisplay(String id) {
        MobileElement element = appiumDriver.findElement(By.id(id));
        Assert.assertTrue(element.getText()+" HATA !",element.isDisplayed()==true);
        Logger logger = null;
        logger.info("Ekran başarılı bir şekilde gözüküyor");

    }


}
