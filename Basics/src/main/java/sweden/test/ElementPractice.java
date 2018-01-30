package sweden.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementPractice {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suruc\\jars\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Step to navigate to google.com
        driver.navigate().to("http:\\www.google.com");

        // Asserting the title. Expected should be
        // Step to verify that actual title is matching the expected title
        Assert.assertEquals("This title will not be printed", "Google", driver.getTitle());
        // Assert.assertEquals("Title not maching", "Some search search ", driver.getTitle());
        /*  If we'll run line 21 the code will stop there only to throw the error message there that the
         Expected Assert is not equal to Actual Assert  */

        // Step to capture the webelement of the search field
        WebElement e = driver.findElement(By.name("q"));

        // Step to enter search-key in the text field captued in above step
        e.sendKeys("Sandra Bullock movies");

        // Step to select one entry form the search - auto - suggestions list displayed
        driver.findElement(By.xpath("//*[@id='sbse0']/div[2]")).click();

        // Step to click on the first search result
        driver.findElement(By.xpath("//div[@id='search']//div[@class='srg']/div[1]//h3/a")).click();
    }
}
