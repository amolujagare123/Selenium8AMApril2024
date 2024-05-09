package TestNGDemo.realSites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AISites {

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
    public void openAIHomepage() {
        driver.get("https://openai.com/");
    }

    @Test
    public void deepMindHomepage() {
        driver.get("https://deepmind.com/");
    }

    @Test
    public void IBMResearchAIHomepage() {
        driver.get("https://www.research.ibm.com/artificial-intelligence/");
    }

    @Test
    public void allenNLPHomepage() {
        driver.get("https://allennlp.org/");
    }
}
