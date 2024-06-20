package OtherImportant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragAndDropDemo {

    @Test
    public void scrollDemo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement source = driver.findElement(By.xpath("//div[@id='box1']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='box106']"));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(source,target).build().perform();





    }
}
