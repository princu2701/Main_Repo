package PersonalMilestone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javascript1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		
//		//jsExecutor.executeScript("document.getElementById('openwindow').click()");
//		
	    WebElement op = driver.findElement(By.cssSelector("[name='radioButton']"));
//	  
        jsExecutor.executeScript("arguments[0].click()", op);
	  
		jsExecutor.executeScript("arguments[0].scrollIntoView()", op);
//		
		WebElement supr = driver.findElement(By.id("autocomplete"));
		
		jsExecutor.executeScript("arguments[0].setAttribute('value','My Name Is Prince')",supr);
		
	      driver.findElement(By.id("autocomplete")).clear();
	      
	      jsExecutor.executeScript("document.getElementById('autocomplete').value='Prince Raj'\r\n");

		


	 
	 
		
		


		

	}

}
