package OtherImportant;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertsDemo2 {

    @Test
    public void scrollDemo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol.html");

        WebElement alertElement = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
        alertElement.click();

        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());
      //  alert.accept();
        alert.dismiss();

        WebElement afterAlertMessage = driver.findElement(By.xpath("//p[@id='demo']"));

        System.out.println(afterAlertMessage.getText());






    }
}
