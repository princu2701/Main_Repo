package Self;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Inclass {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.cssSelector("input[placeholder='Search for anything']")).sendKeys("nike");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@aria-label=\'nike shoes\']")).click();
		
	WebElement cl = driver.findElement(By.cssSelector("#gh-cat"));
	
       Select spr = new Select(cl);
	
	   spr.selectByValue("888");
	   
	  driver.findElement(By.cssSelector("input[value='Search']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
