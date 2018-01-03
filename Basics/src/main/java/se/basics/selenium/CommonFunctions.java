package se.basics.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonFunctions {

    public WebDriver launchBrowser(String webUrl) {
        WebDriver driver = launchBrowser();
        driver.get(webUrl);
        return driver;
    }

    public WebDriver launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suruc\\jars\\chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        return browser;
    }
}
