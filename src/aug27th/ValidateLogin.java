package aug27th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateLogin {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void validateLoginTest1()
	{
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("reyaz0806");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("reyaz123");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");
		
	}

	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
