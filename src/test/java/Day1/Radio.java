package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio {
	
	public static void main(String[] args) {
		
		WebDriver prince = new FirefoxDriver();
		
		
		prince.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> radio = prince.findElements(By.cssSelector("input[type=\'radio\']"));
		
		for (WebElement rad : radio) {
			
			rad.click();
			
		} 
		
		
		
	
	
	
	}

}
