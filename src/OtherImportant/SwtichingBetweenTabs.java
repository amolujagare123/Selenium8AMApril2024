package OtherImportant;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class SwtichingBetweenTabs {

    @Test
    public void scrollDemo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol2.html");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://facebook.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://gmail.com");


        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));

        System.out.println(driver.getTitle());








    }
}
