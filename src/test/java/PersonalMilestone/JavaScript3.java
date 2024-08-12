package PersonalMilestone;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript3 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
		
		WebElement pp = driver.findElement(By.id("name"));
		
		jsExecutor.executeScript("arguments[0].setAttribute('value','Prince Raj')",pp);
		
		

	}

}
