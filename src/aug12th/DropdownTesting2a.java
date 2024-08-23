package aug12th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTesting2a {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
				
	    new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Books");
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
