package sep2nd;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollDemo2 {

	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void scrollTest1() throws InterruptedException
	{
		
		WebElement block=driver.findElement(By.xpath("//div[text()='Make Money with Us']/parent::div"));
	
		List<WebElement> allLinks=block.findElements(By.tagName("a"));
		
		//driver.findElement(By.xpath("//a[text()='Sell on Amazon']")).click();	
		
		allLinks.get(0).click();
		
	}

	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}


}
