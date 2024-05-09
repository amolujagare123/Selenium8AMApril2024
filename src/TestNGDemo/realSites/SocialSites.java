package TestNGDemo.realSites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites {

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
       // driver.close();
    }
    @Test (priority = 4)
    public void facebookHomepage() {
        driver.get("https://www.facebook.com/");
    }

    @Test (priority = 1)
    public void twitterHomepage() {
        driver.get("https://twitter.com/");
    }

    @Test (priority = 2)
    public void linkedInHomepage() {
        driver.get("https://www.linkedin.com/");
    }

    @Test (priority = 3)
    public void snapchatHomepage() {
        driver.get("https://www.snapchat.com/");
    }
}
