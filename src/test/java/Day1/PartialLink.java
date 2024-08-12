package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLink {
	
public static void main(String[] args) {
		
		WebDriver prince = new FirefoxDriver();
		
		prince.get("https://www.ebay.com/");
		
		prince.findElement(By.partialLinkText("He")).click();
		

}
}
