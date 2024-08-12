package Day1;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Elements {
	
public static void main(String[] args) {
		
		WebDriver prince = new FirefoxDriver();
		
		prince.get("https://www.ebay.com/");
		
		List<WebElement> Ebay = prince.findElements(By.tagName("a"));
          
		for (WebElement Link : Ebay) {
			
			String num = Link.getText();
			
			System.out.println(num);
		}
		
		
}

}
