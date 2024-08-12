package Switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NameAlert {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("#name")).sendKeys("Prince Raj");
		
		driver.findElement(By.cssSelector("[id=\'alertbtn\']")).click();
		
		org.openqa.selenium.Alert al=driver.switchTo().alert();
		
		String eAlert=al.getText();
		
		if (eAlert.contains("Prince Raj")) {
			
			Thread.sleep(2000);
			
			al.accept();
			
		}else {
				System.out.println("Prince is not here");
			}
			
			
			
		
	}
}
