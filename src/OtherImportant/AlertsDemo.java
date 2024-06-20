package OtherImportant;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AlertsDemo {

    @Test
    public void scrollDemo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol2.html");

        WebElement alertElement = driver.findElement(By.xpath("//input[@id='alertbtn']"));
        alertElement.click();

        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());
        alert.accept();






    }
}
