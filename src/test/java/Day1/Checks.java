package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checks {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver prince = new FirefoxDriver();
		
		prince.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	//Multiple Checks at a time
   List<WebElement> check = prince.findElements(By.cssSelector("input[type=\'checkbox\']"));
              
		       for (WebElement ch : check) {
		    	    ch.click();
		    	   
				
			}
	    	   prince.close();

		         
		}

}
