package PersonalMilestone;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelfWindow4 {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("[id='opentab']")).click();
		
		String single = driver.getWindowHandle();
		
		Set<String> all = driver.getWindowHandles();
		
		for (String All : all) {
			
			if(!All.equals(single)) {
				
				driver.switchTo().window(All);
				
				System.out.println("Okkk!!!");
			}
			
		}

	}

}
