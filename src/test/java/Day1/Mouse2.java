package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.ebay.com/");
		
		Actions act = new Actions(driver);
		
		WebElement prince = driver.findElement(By.linkText("Electronics"));
		
		
		act.moveToElement(prince).build().perform();
		
		
		
		

	}

}
