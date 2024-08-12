package PersonalMilestone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Approach2Dyd {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new FirefoxDriver();

	        driver.get("https://www.ebay.com/"); 

	        driver.findElement(By.cssSelector("[id='gh-ac']")).sendKeys("nike");
			  
			  Thread.sleep(4000);
			  
			 List<WebElement> options = driver.findElements(By.cssSelector(".ui-menu-item"));
			  
			  for (WebElement option : options) {
				  
				  if(option.getText().equals("nike shoes")){
					  
					  option.click();

	}

}
			  
	}
	
}
