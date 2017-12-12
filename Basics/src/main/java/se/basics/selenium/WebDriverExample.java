package se.basics.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverExample {


    public static void main(String[] args) {

        // as the error messsage says: Set the system property for webdriver.chrome.driver with path to the exe file
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suruc\\jars\\chromedriver.exe");

        // Launch the chrome browser
        WebDriver browser = new ChromeDriver();


        // navigate to a website
        browser.navigate().to("http://www.google.com");

        // capture the title
        System.out.println(browser.getTitle() + " - - - - is the title of the current webpage");

        // current url of the webpage
        System.out.println(browser.getCurrentUrl() + " - - - -is the URL");

        // alternative keyword for navigation
        browser.get("http://www.fb.com");
        System.out.println(browser.getTitle() + "- - - - is the title of the current webpage");
        System.out.println(browser.getCurrentUrl() + " - - - -is the URL");

        // capture some information from the website
        // - title of the page
        // - url of the page
        // -...t.ex
        // close the browser
        browser.close();
// the below line will give null pointer exception as the browser has already been closed.
//        System.out.println(browser.getTitle());

    }

}
