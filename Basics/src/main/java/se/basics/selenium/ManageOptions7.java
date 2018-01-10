package se.basics.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class ManageOptions7 {


    public static void main(String[] args) {
        // manage
        /**
         * - cookies
         * - window size
         */

        // launch browser and navigate to https://www.naukri.com
        CommonFunctions3 cf = new CommonFunctions3();
        WebDriver driver = cf.launchBrowser("https://www.naukri.com");

        Dimension size = driver.manage().window().getSize();
        System.out.println(size.getHeight() + "is the height of the browser");
        System.out.println(size.getWidth() + "is the width of the browser");


        String sessionId = driver.getWindowHandle();
        System.out.println("The session ID of the parent window is: " + sessionId);

        Set<String> sessionIds = driver.getWindowHandles();

        // for loop to iterate on the abvoe variable
        for (String id : sessionIds) {
            System.out.println(id + " is the window ID ");
            driver.switchTo().window(id);
            // capture the title of the window
            System.out.println("Title of this site is - " + driver.getTitle());
            System.out.println("Current URL of the site is - " + driver.getCurrentUrl());
            System.out.println("===========================");

        }


//        driver.manage().window().maximize();

        //      driver.manage().window().fullscreen();

//        driver.quit(); // all the pop up windows (browsers created in the same session) are closed
//        driver.close(); // only the browser under control is closed leaving all the connected windows open
    }

}
