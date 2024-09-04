package sep4th;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WaitsDemo1 {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test
	public void waitsTest1() throws InterruptedException
	{
	
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//Hard Wait using Thread.sleep();
		
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("reyaz");
	}

	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
