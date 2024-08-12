package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexecutor {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		try {
						
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			JavascriptExecutor jsExecutor= (JavascriptExecutor) driver;
			
			//for typing
			
			jsExecutor.executeScript("document.getElementById('autocomplete').value='prince'");
			
			//for clicking
			
			jsExecutor.executeScript("document.getElementById('checkBoxOption1').click()");
			
			//for scrolling
			
			jsExecutor.executeScript("window.scrollBy(0,800)\r\n");
			
			WebElement driverElement= driver.findElement(By.id("mousehover"));
						
			jsExecutor.executeScript("arguments[0].scrollIntoView(true)",driverElement);
			
			System.out.println("Prince !!! You are Tough Man");		
			
	     
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
		driver.close();
		
		

	}

}
