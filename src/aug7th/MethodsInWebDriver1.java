package aug7th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebDriver1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/table[2]/tbody/tr/td[2]/a/img")).click();
		
		System.out.println(driver.getWindowHandles());
		
		//driver.close();
		
		driver.quit();

	}

}
