package PersonalMilestone;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSSELF {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		
 //      || First Approach || 
		
		jsExecutor.executeScript("document.getElementById(\"autocomplete\").value='Prince Raj'\r\n");
		
//       || Second Approach ||  
		
		WebElement pro = driver.findElement(By.id("autocomplete"));
		
		jsExecutor.executeScript("arguments[0].setAttribute('value','Prince Raj')",pro);
		
		

	}

}
