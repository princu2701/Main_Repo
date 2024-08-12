package PersonalMilestone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelfFrame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver prince = new FirefoxDriver();
		prince.get("https://rahulshettyacademy.com/AutomationPractice/");
		   
		   prince.findElement(By.id("opentab")).click();
		   
		   Thread.sleep(3000);
		   
		   for (String All : prince.getWindowHandles()) {
			   
			   if(!All.equals(prince.getWindowHandle())) {
				   
				   prince.switchTo().window(All);
				   
				   System.out.println("I am at the new Site");
			   }
			
		}

	}

}
