package Screens;

import Screens.BaseUtilities;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.restassured.path.json.JsonPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LoginScreen extends BaseUtilities {
    //AppiumDriver driver;


    //Locators

    By userNameTextField = AppiumBy.accessibilityId("test-Username");
    By passwordTextField = AppiumBy.accessibilityId("test-Password");
    By LoginButton = AppiumBy.accessibilityId("test-LOGIN");
//    WebElement userNameTextField = driver.findElement(AppiumBy.accessibilityId("test-Username"));
//    WebElement passwordTextField = driver.findElement(AppiumBy.accessibilityId("test-Password"));
//    WebElement LoginButton = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]"));


    public void login(String filepath) throws FileNotFoundException, InterruptedException {
//        try {
//
//            JsonPath jp=new JsonPath(new FileInputStream(filePath));
////            String value=jp.get(key); //key is the data from .json file
            //String username = getJsonData("loginDetails.username");
            //String password = getJsonData("loginDetails.password");

            sendKeys(userNameTextField, getJsonData("loginDetails.username"));
            sendKeys(passwordTextField,getJsonData("loginDetails.password"));
        while(isElementDisplayed(LoginButton)) {
            clickOnElement(LoginButton);
            Thread.sleep(2000);
        }
//            userNameTextField.sendKeys(username);
//            passwordTextField.sendKeys(password);

            //WebElement userNameTextField = driver.findElement(AppiumBy.accessibilityId("test-Username"));
            // WebElement passwordTextField = driver.findElement(AppiumBy.accessibilityId("test-Password"));
            // WebElement LoginButton = driver.findElement(AppiumBy.accessibilityId("test-LOGIN"));
            // userNameTextField.sendKeys("standard_user");
            //passwordTextField.sendKeys("secret_sauce");

//            while(LoginButton.isDisplayed()){
//                LoginButton.click();
//            }

        }
    }

