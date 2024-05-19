package TestNGDemo.realSites;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites {

    WebDriver driver;

    @BeforeClass
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterClass
    public void closeBrowser()
    {
        driver.close();
    }
    @Test
    public void naukriHomepage() {
        driver.get("https://www.naukri.com/");

        Assert.assertEquals(
                 driver.getTitle(),"my naukri",
                "This is not a naukri website");
    }

    @Test
    public void monsterIndiaHomepage() {
        driver.get("https://www.monsterindia.com/");
    }

    @Test
    public void timesJobsHomepage() {
        driver.get("https://www.timesjobs.com/");
    }

    @Test
    public void indeedIndiaHomepage() {
        driver.get("https://www.indeed.co.in/");
    }
}
