package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SleByindex {
	
	public static void main(String[] args) {
		
		WebDriver prince = new FirefoxDriver();
		
		prince.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement sel = prince.findElement(By.cssSelector("#dropdown-class-example"));
		
		Select s= new Select(sel);
		
		s.selectByIndex(2);
		
		s.selectByValue("option2");
		
		s.selectByVisibleText("Option1");
		
		
		
	
	
	
	
	}

}
