package sweden.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElementPractice {

    public static void main(String[] args) {
        CommonFunctionUsage cf = new CommonFunctionUsage();
        WebDriver browser = cf.commonFunction("https://accounts.google.com/SignUp");


        // code to enter the first name
        browser.findElement(By.id("FirstName")).sendKeys("Suruchi");

        // code to enter the last name
        browser.findElement(By.cssSelector("#LastName")).sendKeys("Bhatia");

        // clear the data from the frist name field by using the clear function
        browser.findElement(By.id("FirstName")).clear();

        // code to enter the email id
        browser.findElement(By.id("GmailAddress")).sendKeys("suruchibhatia80");

        // code to enter the password
        browser.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("SB123");

        // code to enter the confirm password
        browser.findElement(By.name("PasswdAgain")).sendKeys("suruchi1");

        // code to enter the phone number
        browser.findElement(By.id("RecoveryPhoneNumber")).sendKeys("1234567890");

        // code to clear the phone number
        browser.findElement(By.id("RecoveryPhoneNumber")).clear();

        //code to click on 'Next Step' button
        browser.findElement(By.xpath("//*[@id='submitbutton']")).click();


        // --- capture the data like this
        // String lastNameError = browser.findElement(By.id("errormsg_0_LastName")).getText();
        // capture all errors what ever is possible
        // print all the error messages

        String print = browser.findElement(By.xpath("//*[@id='errormsg_0_LastName']")).getText();
        System.out.println("Error Message printed : " + print);


        /*
          1. enter the firstname
          2. enter the lastname
          3. enter the email id (something)
          4. some 4 digit text as password
          5. some 8 digit text as password in confirm password field
          6. enter text from the phone number field.
          7. clear text in the phone number field. (using 'clear' function)
          8. click on "next" button
          9. Captue the error message for each field and print them on the console

         */

    }
}
