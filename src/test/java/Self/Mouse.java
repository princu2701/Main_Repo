package Self;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.ebay.com/");
		
		Actions actions=new Actions(driver);
		
		WebElement ele = driver.findElement(By.linkText("Electronics"));
		
		actions.moveToElement(ele).build().perform();
		
		WebElement ele2 = driver.findElement(By.linkText("Fashion"));
		
		actions.moveToElement(ele2).build().perform();
		
		WebElement el3 = driver.findElement(By.linkText("Collectibles and Art"));
		
		actions.moveToElement(el3).build().perform();
		
		driver.close();
		
		
		
	}

}
