package OtherImportant;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {

    @Test
    public void scrollDemo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol.html");

        WebElement fileUploadElement = driver.findElement(By.xpath("//input[@value='browse here']"));

        fileUploadElement.sendKeys("D:\\code\\HelloWorld.java");

    }
}
