package OtherImportant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class SwtichingBetweenWindows {

    @Test
    public void scrollDemo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
      //  driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol2.html");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://facebook.com");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://gmail.com");

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(0));

        System.out.println(driver.getTitle());








    }
}
