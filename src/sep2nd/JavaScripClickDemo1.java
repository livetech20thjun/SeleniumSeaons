package sep2nd;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScripClickDemo1 {

	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.pepperfry.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void scrollTest1() throws InterruptedException
	{
	
		//org.openqa.selenium.ElementClickInterceptedException:
		//driver.findElement(By.xpath("//div[text()='Sell on Pepperfry']")).click();	
		
		WebElement element=driver.findElement(By.xpath("//div[text()='Sell on Pepperfry']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		
		
		
		
	}

	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}


}
