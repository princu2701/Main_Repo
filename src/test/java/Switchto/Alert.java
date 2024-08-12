package Switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("[value='Alert']")).click();
		
		org.openqa.selenium.Alert ele = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		String eletext=ele.getText();
		
		System.out.println(eletext);
		
		ele.accept();
		
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		
		org.openqa.selenium.Alert prAlert=driver.switchTo().alert();
		
         String prString=prAlert.getText();
		
		System.out.println(prString);
		
		Thread.sleep(2000);
		
		prAlert.dismiss();
		
		driver.close();
		
		
				
		
		
	}

}
