package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicit {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
	}
	
	

	

}
