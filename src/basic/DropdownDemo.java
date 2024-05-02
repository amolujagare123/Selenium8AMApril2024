package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        // 1. find the web element
        WebElement drpTxt = driver.findElement(By.id("seltext"));

        // 2. create the object of Select class
        Select selText = new Select(drpTxt);


        Thread.sleep(4000);
        // 3. select the option using Select class object
      //  selText.selectByVisibleText("text 2");
      //  selText.selectByIndex(3);
        selText.selectByValue("val1");

    }
}
