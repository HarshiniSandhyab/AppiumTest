import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screen {
    AppiumDriver driver;
    public Screen(AppiumDriver driver)
    {
        this.driver=driver;
    }


    public void login() throws InterruptedException {
        WebElement userNameTextField = driver.findElement(AppiumBy.accessibilityId("test-Username"));
        WebElement passwordTextField = driver.findElement(AppiumBy.accessibilityId("test-Password"));
        WebElement LoginButton = driver.findElement(AppiumBy.accessibilityId("test-LOGIN"));
        userNameTextField.sendKeys("standard_user");
        passwordTextField.sendKeys("locked_out_user");
        Thread.sleep(3000);
        LoginButton.click();
    }

}
