package sep2nd;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScripClickDemo2 {

	
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
		
		String homeWindowId=driver.getWindowHandle();
	
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//p[text()='Partner With Us']/parent::div/descendant::div"));
		
		System.out.println(allLinks.size());
		
		
		/*
		 * for(int i=0;i<allLinks.size();i++) {
		 * 
		 * ((JavascriptExecutor)driver).executeScript("arguments[+i+'].click();",
		 * allLinks);
		 * 
		 * Thread.sleep(3000); }
		 */
		 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",allLinks.get(0));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",allLinks.get(1));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",allLinks.get(2));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",allLinks.get(3));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",allLinks.get(4));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",allLinks.get(5));
		
		
		/*
		 * for(WebElement temp:allLinks) {
		 * ((JavascriptExecutor)driver).executeAsyncScript("arguments[0].click();",
		 * temp);
		 * 
		 * Thread.sleep(3000);
		 * 
		 * driver.switchTo().window(homeWindowId); }
		 */
		
		
		
		
		
	}

	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}


}
