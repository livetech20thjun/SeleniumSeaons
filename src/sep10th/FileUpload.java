package sep10th;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpload {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://imgur.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test
	public void fileUploadTest1() throws InterruptedException, IOException, AWTException
	{
		
		driver.findElement(By.xpath("//a[@class='Button upload']/child::img")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[text()='Choose Photo/Video']/child::img")).click();
		
		Thread.sleep(3000);
		
		String filePath = "D:\\012LivetechWS\\SeleniumSeasons\\SQL joins.png";
		
		StringSelection selection=new StringSelection(filePath);
		
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		
		Clipboard  clipboard=toolkit.getSystemClipboard();
		
		clipboard.setContents(selection, null);
		
		Robot rb=new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
	}

	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}


}
