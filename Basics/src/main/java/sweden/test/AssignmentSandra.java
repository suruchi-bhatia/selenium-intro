package sweden.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssignmentSandra {

    public static void main(String[] args) {
        CommonFunctionUsage common = new CommonFunctionUsage();
        WebDriver driver = common.commonFunction("http://www.google.com");

        driver.findElement(By.id("lst-ib")).sendKeys("Sandra Bullock");

        driver.findElement(By.xpath(".//*[@id='sbse0']/div[2]")).click();

        driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div[1]//h3/a")).click();
    }
}
