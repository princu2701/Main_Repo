package PersonalMilestone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelfWind1 {

	public static void main(String[] args) throws InterruptedException {
		
		//1st Approach
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("opentab")).click();;
		
		Thread.sleep(2000);
		
		for (String wind : driver.getWindowHandles()) {
			
			if(!wind.equals(driver.getWindowHandle())) {
				driver.switchTo().window(wind);
				
				System.out.println("YEss !!!I can do it");
				
				driver.findElement(By.linkText("Access all our Courses")).click();
				
			}
			
		}
		

	}

}
