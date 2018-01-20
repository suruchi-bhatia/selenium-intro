package se.basics.selenium;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class CookieExample8 {
    public static void main(String[] args) {

        CommonFunctions3 cf = new CommonFunctions3();
        WebDriver driver = cf.launchBrowser("https://www.naukri.com");

        Set<Cookie> allCookies = driver.manage().getCookies();

        System.out.println(allCookies.size());

        for (Cookie c : allCookies) {

            System.out.println("This will give the name = " + c.getName());
            System.out.println("This will give the path = " + c.getPath());
            System.out.println("This will give the domain name = " + c.getDomain());
            System.out.println("This will give the boolean value = " + c.isSecure());
            System.out.println("This will give the value = " + c.getValue());
            System.out.println("==========================");

        }
        driver.manage().deleteCookieNamed("test");


        allCookies = driver.manage().getCookies();

        System.out.println(allCookies.size());

        for (Cookie c : allCookies) {

            System.out.println("This will give the name = " + c.getName());
            System.out.println("This will give the path = " + c.getPath());
            System.out.println("This will give the domain name = " + c.getDomain());
            System.out.println("This will give the boolean value = " + c.isSecure());
            System.out.println("This will give the value = " + c.getValue());
            System.out.println("==========================");

        }
    }
}
