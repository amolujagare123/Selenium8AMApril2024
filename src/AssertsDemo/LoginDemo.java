package AssertsDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginDemo {

    @Test
    public void myTest1() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin1");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        /*String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();
*/
     /*   String expected = "https://stock.scriptinglogic.org/dashboard.php";
        String actual = driver.getCurrentUrl();*/

        String expected = "Dashboard";
        String actual = "";
      try {
             actual = driver.findElement(By.xpath("//a[@class='active-tab dashboard-tab']")).getText();
        }
        catch(Exception e)
        {

        }
    /*    String expected = "https://stock.scriptinglogic.org/dashboard.php";
        String actual = driver.getCurrentUrl();*/

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"This is not a dashboard");
    }
}
