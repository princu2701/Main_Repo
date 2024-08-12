package PersonalMilestone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Approach1dynamic {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.ebay.com/");
		
		  driver.findElement(By.cssSelector("[id='gh-ac']")).sendKeys("Nike");
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.cssSelector("a[aria-label=\'nike shoes\']")).click();
		  
		  
		 
		
		
		
		
		//
		
		

	}

}
