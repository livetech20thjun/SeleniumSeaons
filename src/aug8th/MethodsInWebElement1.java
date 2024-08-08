package aug8th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebElement1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("reyaz0806");
		
		driver.findElement(By.id("password")).sendKeys("reyaz123");
		
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("datepick_in")).clear();
		
		driver.findElement(By.id("datepick_in")).sendKeys("10/08/2024");
		
		driver.findElement(By.id("datepick_out")).clear();
		
		driver.findElement(By.id("datepick_out")).sendKeys("11/08/2024");
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
