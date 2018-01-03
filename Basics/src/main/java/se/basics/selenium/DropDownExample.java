package se.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownExample {
    public static void main(String[] args) {

        // Laucnh chorme and navigate to the website
        CommonFunctions co = new CommonFunctions();
        WebDriver driver = co.launchBrowser("http://the-internet.herokuapp.com/dropdown");

        // select the option from the dropdown
        // input is : Option 2
        driver.findElement(By.tagName("select")).sendKeys("Option 2");


        Select select = new Select(driver.findElement(By.tagName("select")));
        List<WebElement> allOptions = select.getOptions();

        // using a loop, iterate on the list of all options obtainded and stored in the above step
        for (WebElement entry : allOptions) {
            System.out.println(entry.getText() + " = " + allOptions.indexOf(entry));
        }

        select.selectByVisibleText("Option 1");

        System.out.println("The selected option text is : " + select.getFirstSelectedOption().getText());


        System.out.println("Is multiple?? " + select.isMultiple());
        select.selectByIndex(2);
        System.out.println("Sselected option text for the second attempt is : " + select.getFirstSelectedOption().getText());

    }
}
