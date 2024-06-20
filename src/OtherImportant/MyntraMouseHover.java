package OtherImportant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class MyntraMouseHover {

    @Test
    public void scrollDemo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");

        WebElement menMenu = driver.findElement(By.xpath("//a[@data-group='men']"));

        Actions action = new Actions(driver);

        action.moveToElement(menMenu).build().perform();



    }
}
