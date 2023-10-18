package Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.restassured.path.json.JsonPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseUtilities {

    public static AppiumDriver driver;
    public static final String filePath = "/Users/testvagrant/Documents/workspace2/AppiumProject/src/main/resources/data.json";

    public static void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appium:app", "./sample_app.apk");
        desiredCapabilities.setCapability("appPAckage", "com.swaglabsmobileapp.SplashActivity");
        desiredCapabilities.setCapability("appium:appWaitActivity", "com.swaglabsmobileapp.MainActivity");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        URL remoteUrl = new URL("http://0.0.0.0:4723");
        driver = new AndroidDriver(remoteUrl, desiredCapabilities);

    }
    public static String getJsonData(String key) throws FileNotFoundException {
        JsonPath jp=new JsonPath(new FileInputStream(filePath));
            String value=jp.get(key);
        return value;
    }

    public void sendKeys(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    public boolean isElementDisplayed(By by){
        try {
            return driver.findElement(by).isDisplayed();
        }catch(Exception e){
            System.out.println("Element not found");
            return false;
        }
    }
    public static void quitTabs()
    {

        driver.quit();
    }

}
