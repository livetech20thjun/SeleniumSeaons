package aug29th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DoubleClick {
	

	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void rightClickTest1() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//input[@id='email_field']")).sendKeys("admin123@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_field']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()='Login to Account']")).click();
		
		Thread.sleep(5000);
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Intractions')]")))
				 .pause(3000)
				 .click(driver.findElement(By.xpath("//a[text()='Double Click']")))
				 .pause(2000)
				 .build()
				 .perform();
		
				action.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Intractions')]")))
				 .pause(3000)
				 .click(driver.findElement(By.xpath("//a[text()='Double Click']")))
				 .pause(2000)
				 .build()
				 .perform();
		
		
				 action.doubleClick(driver.findElement(By.xpath("//button[text()='Double Click']")))
				 .pause(3000)
				 .build()
				 .perform();
		
		
	}

	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
