package Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static Reports.util.ForReports.browserScreenshot;

public class LoginTest {

    ExtentReports extent;
    @BeforeClass
    public void initExtent()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        reporter.config().setDocumentTitle("Stock Management System");
        reporter.config().setReportName("Regression Testing");

        extent.setSystemInfo("Dev Name","Mahesh");
        extent.setSystemInfo("Testers Name","Madhavi");
        extent.setSystemInfo("type of testing","Regression Testing");
        extent.setSystemInfo("Project name","Stock Management");
        extent.setSystemInfo("Description","This software efficiently tracks inventory levels, manages stock orders, and optimizes supply chain operations for businesses.");
        extent.setSystemInfo("version","ver1.501");
        extent.setSystemInfo("Module name","Customer");
        extent.setSystemInfo("OS","Windows 10");
        extent.setSystemInfo("Browser","Chrome");
    }

    @AfterClass
    public void writeToReport()
    {
        extent.flush();
    }

    @Test
    public void myTest1() throws IOException {

        ExtentTest test = extent.createTest("valid login test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin1");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");
        String expected = "Dashboard";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//a[@class='active-tab dashboard-tab']")).getText();
        }
        catch(Exception e)
        {

        }

        /*System.out.println("expected="+expected);
        System.out.println("actual="+actual);*/

        try {
            Assert.assertEquals(actual, expected, "This is not a dashboard");
            test.pass("This test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+browserScreenshot(driver));

        }


    }

    @Test
    public void myTest2() throws IOException {

        ExtentTest test = extent.createTest("invalid login test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("sdsds");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("dsds");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");
        String expected = "Wrong Username or Password";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();

        }
        catch(Exception e)
        {

        }

        /*System.out.println("expected="+expected);
        System.out.println("actual="+actual);*/

        try {
            Assert.assertEquals(actual, expected, "incorrect or no error message");
            test.pass("This test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+browserScreenshot(driver));
        }


    }

    @Test
    public void myTest3() throws IOException {

        ExtentTest test = extent.createTest("blank login test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");
        String expected = "POSNIC - Login to Control Panel";
        String actual = driver.getTitle();


        try {
            Assert.assertEquals(actual, expected, "incorrect or no error message");
            test.pass("This test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+browserScreenshot(driver));
        }


    }
}
