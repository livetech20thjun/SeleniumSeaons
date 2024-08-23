package aug12th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropdownTesting1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.mobiscroll.com/jquery/select/multiple-select#");
		
		driver.manage().window().maximize();
		
		//WebElement element1=driver.findElement(By.id("multiple-select-input"));
		
		//new Select(element1).selectByVisibleText("Books");
		
		driver.findElement(By.xpath("")).click();
		
		driver.findElement(By.xpath("//div[text()='Books']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Health & Beauty']")).click();
		
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
				

	}

}
