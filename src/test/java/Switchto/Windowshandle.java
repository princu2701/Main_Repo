package Switchto;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowshandle {

	public static void main(String[] args) {
		
                     WebDriver driver= new FirefoxDriver();
                     
                     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
                     
                     driver.findElement(By.id("opentab")).click();
                     
                     String single = driver.getWindowHandle();
                     
                     Set<String> all = driver.getWindowHandles();
                     
                     String title = "QAClick Academy - A Testing Academy to Learn, Earn and Shine";
                     
                     for (String id : all) {
                    	 
                    	 driver.switchTo().window(id);
                    	 
                    	 if(driver.getTitle().equals(title)) {
                    		 
                    		 break;
                    		 
                    		 
                    	 }
						
					}
                     driver.switchTo().window(single);
                     
                     
                     
                     
                     
                     
                     
                     
                     
	}
	
	//2nd Approach

}
