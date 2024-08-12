package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText {
	
	public static void main(String[] args) {
		
		WebDriver prince = new FirefoxDriver();
		
		prince.get("https://www.ebay.com/");
		
		prince.findElement(By.linkText("Help & Contact")).click();
		
		prince.findElement(By.linkText("Register now")).click();
	}

}
