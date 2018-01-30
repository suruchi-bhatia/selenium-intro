package sweden.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssignmentPizzaHut {

    public static void main(String[] args) {
        CommonFunctionUsage cf = new CommonFunctionUsage();
        WebDriver browser = cf.commonFunction("http://restaurants.pizzahut.co.in//");

        browser.findElement(By.id("OutletSearch")).sendKeys("Hyderabad");

        browser.findElement(By.xpath("//div[7]/div[1]")).click();

        browser.findElement(By.xpath("//*[@id='SearchByGivenAddress']/div/input")).click();

        String print = browser.findElement(By.xpath("//section[2]/div/div[2]/div/div[1]/div")).getText();
        System.out.println("List of all the brnaches displayed : " + print);

        browser.findElement(By.xpath("//section[2]/div/div[2]/div/div[1]/div/ul[4]/li/ul[1]/li[2]/a/b")).click();

        browser.get("http://restaurants.pizzahut.co.in/pizza-hut-pizza-restaurant-banjara-hills-hyderabad-1130/Home");

        browser.findElement(By.xpath("//div[4]/ul/li/a/img")).click();

        // browser.getWindowHandle().contains("Pizza");
        //browser.get("size");

        //browser.findElement(By.xpath("//*[@id='SearchByGivenAddress']/div/input")).click();
        //browser.findElement(By.xpath("//*[@id='SearchByGivenAddress']/div")).click();
        //Select select = new Select(browser.findElement(By.xpath("//html/body/div[7]/div[1]")));
        //List<WebElement> allOptions = select.getOptions();
        //for (WebElement options : allOptions) {
        //  System.out.println("Print Text : " + options.getText());
    }
    //select.selectByVisibleText("Hyderabad, Telangana");

}
