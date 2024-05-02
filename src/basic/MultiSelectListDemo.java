package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        // 1. find the web element
        WebElement multiTxt = driver.findElement(By.id("multiSel"));

        // 2. create the object of Select class
        Select selText = new Select(multiTxt);


        Thread.sleep(4000);
        // 3. select the option using Select class object
       selText.selectByVisibleText("text 2");
       selText.selectByIndex(3);
       selText.selectByIndex(0);

        Thread.sleep(2000);
     /*   selText.deselectByVisibleText("text 2");

        Thread.sleep(2000);
        selText.deselectByIndex(3);

        Thread.sleep(2000);
        selText.deselectByIndex(0);*/

        selText.deselectAll();




    }
}
