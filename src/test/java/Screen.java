import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.restassured.path.json.JsonPath;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileReader;

public class Screen {
    AppiumDriver driver;

    public Screen(AppiumDriver driver) {
        this.driver = driver;
    }

    public void login(String filePath) throws InterruptedException {
        try {

            JsonPath jp=new JsonPath(new FileInputStream(filePath));
//            String value=jp.get(key); //key is the data from .json file

            WebElement userNameTextField = driver.findElement(AppiumBy.accessibilityId("test-Username"));
            WebElement passwordTextField = driver.findElement(AppiumBy.accessibilityId("test-Password"));
            WebElement LoginButton = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]"));

            String username = jp.get("username");
            String password = jp.get("password");
            userNameTextField.sendKeys(username);
            passwordTextField.sendKeys(password);

            //WebElement userNameTextField = driver.findElement(AppiumBy.accessibilityId("test-Username"));
            // WebElement passwordTextField = driver.findElement(AppiumBy.accessibilityId("test-Password"));
            // WebElement LoginButton = driver.findElement(AppiumBy.accessibilityId("test-LOGIN"));
            // userNameTextField.sendKeys("standard_user");
            //passwordTextField.sendKeys("secret_sauce");

            while(LoginButton.isDisplayed()){
                LoginButton.click();
            }
//            LoginButton.click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
