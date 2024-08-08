package aug8th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebElement2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		//driver.get("https://echoecho.com/htmlforms09.htm");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login")).click();
		
		System.out.println(driver.findElement(By.id("username_span")).getText());
		
		System.out.println(driver.findElement(By.id("username_span")).getAttribute("class"));
		
		System.out.println(driver.findElement(By.id("username_span")).getAttribute("name"));
		
		System.out.println(driver.findElement(By.id("username_span")).getCssValue("color"));
		
		//System.out.println(driver.findElement(By.name("option2")).getAttribute("checked"));
		 
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
