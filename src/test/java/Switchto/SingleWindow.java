package Switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingleWindow {
	
	
	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		 WebElement pr = driver.findElement(By.id("opentab"));
		 
		 String url = pr.getAttribute("href");
		 
		 driver.navigate().to(url);
		
		
	}

}
