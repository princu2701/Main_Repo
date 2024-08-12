package BrokenLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class first {
	
	@Test
	
	public void stats(){
		
	WebDriver prince = new FirefoxDriver();
		
		prince.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	//Multiple Checks at a time
   List<WebElement> check = prince.findElements(By.cssSelector("input[type=\'checkbox\']"));
              
		       for (WebElement ch : check) {
		    	    ch.click();
		    	   
				
			}
	    	   prince.close();

		         
		}
	
	
		
		
	

@Test

 public void day2() {
		
		WebDriver driver = new FirefoxDriver();
				
				driver.get("https://demo.guru99.com/test/simple_context_menu.html");
				
				Actions act = new Actions(driver);
				
				WebElement pr = driver.findElement(By.cssSelector("[ondblclick=\"myFunction()\"]"));
				
				act.doubleClick(pr).build().perform();
			
			}
}
	
	





