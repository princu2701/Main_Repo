package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyEnter {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.com/");
		
		Actions actions = new Actions(driver);
		
		WebElement pr = driver.findElement(By.id("gh-ac"));
		
		pr.sendKeys("iphone");
		
		actions.keyDown(pr, Keys.ENTER).keyUp(pr, Keys.ENTER).build().perform();
		
		
		
		
		
		
		
		


}
	
}
