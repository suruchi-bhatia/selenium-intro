package se.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchGoogle4 {


    public static void main(String[] args) {
        CommonFunctions3 commonFunctions = new CommonFunctions3();
        WebDriver myBrowser = commonFunctions.launchBrowser();

        myBrowser.navigate().to("http://www.google.com");


        // type a value "cars" in the google search field
        // Google search field is having a unique property called "Name - q"

        myBrowser.findElement(By.name("q")).sendKeys("news");


        // Browser instance  + elment locator  + operation ( + data)
        // To click on link: Browser instnace + link element + click
        // To type text in a text field : Browser instance + text field element + sendKeys + Data

        myBrowser.findElement(By.xpath("//*[@id='sbse3']/div[2]")).click();
        // myBrowser.findElement(By.name("btnK")).click();


        List<WebElement> allResults = new ArrayList<WebElement>();

        // Finding more than one webelement
        allResults = myBrowser.findElements(By.xpath("//div[@class='srg']/div[@class='g']"));


        // fetch the URL from every search result
        // every webelement captured is having a webURL
        // Iterate on the webelements usingg a loop

        for (int i = 0; i < allResults.size(); i++) {
            String url = allResults.get(i).findElement(By.tagName("cite")).getText();
            System.out.println("Iteration count: " + i + " is showing url as : " + url);
        }


    }


}
