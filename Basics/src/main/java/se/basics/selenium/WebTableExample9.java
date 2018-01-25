package se.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTableExample9 {

    public static void main(String[] args) {

        CommonFunctions3 common = new CommonFunctions3();
        WebDriver browser = common.launchBrowser("https://www.sbi.co.in/portal/web/interest-rates/domestic-term-deposits");

        WebElement table = browser.findElement(By.xpath("//*[@id='content-area']/table[1]"));

        // rows in a table
        // cells in a row

        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        System.out.println(allRows.size() + " is the total number of rows");


        List<WebElement> allCells = allRows.get(0).findElements(By.tagName("th"));
        System.out.println("Cell count on Row - 1 (Header) is " + allCells.size());

        List<WebElement> columns = table.findElements(By.xpath("//tr[3]/td")); // by using the xpath under table
        // List<WebElement> columns = browser.findElement(By.xpath("//*[@id='content-area']/table[1]")).findElements(By.xpath("//tr[3]/td"));
        //List<WebElement> columns = table.findElements(By.tagName("th")); // by using the tagname under table
        System.out.println(columns.size() + " is the number of columns in the table");

        // extract data from row 3 and col 4
        System.out.println("Data from R3C4" + allRows.get(2).findElement(By.xpath("td[4]")).getText());

        int colCountSize = allCells.size();

        for (int i = 1; i < allRows.size(); i++) {
            for (int col = 1; col <= colCountSize; col++) {
                //"Data from R" + i + "C" + col + " - " +
                System.out.print(allRows.get(i).findElement(By.xpath("td[" + col + "]")).getText() + "\t");
            }
            System.out.println("");
        }


        int limit = 10;
        for (int a = 0; a < limit; a++) {

        }


        /**
         *
         *
         * Agenda: to extract all the data from the interest rates table on SBI site
         * Step 1: Launched a browser
         * Step 2: Navigated tho SBI site
         * Step 3: Captured a table as a WebElement.
         * Step 4: Using the table element - we calculated the total number of rows in the table
         *  Data: All the rows are stored in a list<webelement>
         * Step 5: Using the row variable we calculated the cell count
         *  Data: All the cells are captured from Row - 0 to count the number of columns
         *  Extra: We tried to find the same cell count with different combinations
         * Step 6: Extracted the data from R3 - C4
         *  Hardcoded the row number and col number to get the text
         * Step 7: Using the for loop starting from Row 1 (as the row 0 is the header)
         *         Using the for loop starting from col 1 to last col
         *         extracted the data from the table and printed the table data.
         */

    }
}
