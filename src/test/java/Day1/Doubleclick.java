package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		
		
WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act = new Actions(driver);
		
		WebElement pr = driver.findElement(By.cssSelector("[ondblclick=\"myFunction()\"]"));
		
		act.doubleClick(pr).build().perform();
	

	}

}
