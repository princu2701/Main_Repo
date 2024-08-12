package PersonalMilestone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelfWing3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://the-internet.herokuapp.com/context_menu");
		
		driver.findElement(By.linkText("Elemental Selenium")).click();
		
		Thread.sleep(2000);
		
		for (String All : driver.getWindowHandles()) {
			
			if(!All.equals(driver.getWindowHandle())) {
				
				driver.switchTo().window(All);
				
				Thread.sleep(2000);
				
				driver.findElement(By.id("email")).sendKeys("princeraj27janu#@gmail.com");
			}
			
		}
		
		

	}

}
