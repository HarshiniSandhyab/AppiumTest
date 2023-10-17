import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.http.HttpClient;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {

    private AppiumDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
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
        //driver=new AppiumDriver(remoteUrl,desiredCapabilities);

    }

    @Test
    public void sampleTest() throws InterruptedException {
        String filePath = "/Users/testvagrant/Documents/workspace2/AppiumProject/data.json";
        Screen screen = new Screen(driver);
        screen.login(filePath);
    }

    @AfterTest
    public void tearDown() {

        driver.quit();
    }
}