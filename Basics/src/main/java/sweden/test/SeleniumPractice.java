package sweden.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suruc\\jars\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http:\\www.google.com");

        System.out.println("Title for this site is : " + driver.getTitle());

        System.out.println("URL of current site is " + driver.getCurrentUrl());

        driver.get("http:\\fb.com");

        System.out.println("What is Window Handle ?? : " + driver.getWindowHandle());

        driver.navigate().to("http:\\www.mail.yahoo.com");

        synchronized (driver) {

        }

    }

}
