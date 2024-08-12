package PersonalMilestone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.ebay.com/");
		
	    WebElement pr = driver.findElement(By.linkText("Fashion"));
		
		Actions actions=new Actions(driver);
		
		actions.moveToElement(pr).build().perform();
		
		driver.close();

	}

}
