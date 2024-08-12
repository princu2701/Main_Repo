package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {

	public static void main(String[] args) {
		
		WebDriver prince = new FirefoxDriver();
		
		prince.get("https://www.ebay.com/");
		
		prince.findElement(By.linkText("Daily Deals")).click();
		
		prince.findElement(By.xpath("//span[@class=\'ebayui-ellipsis-3\']")).click();
		
		prince.navigate().back();
		
		prince.navigate().back();
		
		prince.navigate().forward();
		
		prince.navigate().forward();
		
		prince.navigate().to("https://www.google.com/");
		
		prince.close();
		
	
	
	}

}
