import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
	public static void main (String args[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/amol.html");
		
		//find the web element 
		WebElement  drpText=driver.findElement(By.id("seltext"));
		
		//create the object
		Select selText = new Select(drpText);
		

		// select the option from the drop down
		
		selText.selectByVisibleText("text 4");
		Thread.sleep(4000);

		driver.close();
	}
}