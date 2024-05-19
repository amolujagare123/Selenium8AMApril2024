package AssertsDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void myTest2() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        String expected = "Wrong Username or Password";
        String actual = "";
        try {
             actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();
       }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,
                "incorrect or no error message");

    }

    @Test
    public void myTest3() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        String expected1= "PLEASE ENTER A USERNAME";
        String expected2= "PLEASE PROVIDE A PASSWORD";

        ArrayList<String> expected = new ArrayList<>();
        expected.add(expected1);
        expected.add(expected2);

        ArrayList<String> actual = new ArrayList<>();

        try {
            List<WebElement> errorList = driver.findElements(By.xpath("//label[@class='error']"));

            actual.add(errorList.get(0).getText());
            actual.add(errorList.get(1).getText());
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,
                "incorrect or no error message");

    }
}
