package Screens;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class ProductScreen extends BaseUtilities {
     By menuBar = AppiumBy.accessibilityId("test-Menu");

//    By allItems = AppiumBy.accessibilityId("test-ALL ITEMS"));

    By webView= AppiumBy.accessibilityId("test-WEBVIEW");
    By logout= AppiumBy.accessibilityId("test-LOGOUT");
   public void logoutapp() throws InterruptedException {
       clickOnElement(menuBar);
        while (isElementDisplayed(logout)){
            System.out.println(isElementDisplayed(logout));
            clickOnElement(logout);
            Thread.sleep(3000);
        }



    }



}
