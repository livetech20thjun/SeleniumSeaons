package aug26th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownTesting3 {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		List<WebElement> allItems=drop.findElements(By.tagName("option"));
		
		System.out.println("No of items "+allItems.size());
		
		for(int i=0;i<allItems.size();i++)
		{
			System.out.println(allItems.get(i).getText());
		}
		
		
		driver.quit();
	

	}

}
