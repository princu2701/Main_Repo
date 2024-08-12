package PersonalMilestone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selfwing2 {
	
   public static void main(String[] args) throws InterruptedException {
	   
	   WebDriver prince = new FirefoxDriver();
	   
	   prince.get("https://rahulshettyacademy.com/AutomationPractice/");
	   
	   prince.findElement(By.id("opentab")).click();
	   
	   Thread.sleep(3000);
	   
	   for (String All : prince.getWindowHandles()) {
		   
		   if(!prince.equals(prince.getWindowHandle())) {
			   
			   prince.switchTo().window(All);
			   
			   System.out.println("Yess!!! I was Able to do it on my own");
			   
			   
		   }
		
	}
	   prince.quit();
   }

}
