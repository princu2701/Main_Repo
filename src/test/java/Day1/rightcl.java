package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class rightcl {
	
public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions ac = new Actions(driver);
		
		WebElement pr = driver.findElement(By.cssSelector("span[class=\'context-menu-one btn btn-neutral\']"));
		
		ac.contextClick(pr).build().perform();

}
}
