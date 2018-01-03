package sweden.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C\\Local Settings\\Application Data\\Google\\Chrome\\Application\\chrome.exe");
        WebDriver driver = new ChromeDriver();

    }
}
