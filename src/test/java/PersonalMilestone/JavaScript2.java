package PersonalMilestone;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor prince= (JavascriptExecutor) driver;
		
		prince.executeScript("window.scrollBy(0,3000)\r\n");
		
		prince.executeScript("window.scrollBy(0,-3000)\r\n");
		
		prince.executeAsyncScript("document.getElementById('checkBoxOption1').click()\r\n");
		
		


	}

}
