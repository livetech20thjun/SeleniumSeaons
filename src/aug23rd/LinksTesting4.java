package aug23rd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting4 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement>  allLinks=driver.findElements(By.tagName("a"));
		
		System.out.println("No of links : "+allLinks.size());
		
		for(int i=0;i<allLinks.size();i++)
		{
			System.out.println( allLinks.get(i).getText());
		}

		driver.quit();
	}

}
