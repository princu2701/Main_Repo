package PersonalMilestone;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesself {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("[id='opentab']")).click();
		
		Set<String> allString = driver.getWindowHandles();
				
		String parent=driver.getWindowHandle();
		
		for (String Nall : allString) {
			
			if(!Nall.equals(parent)) {
				
				driver.switchTo().window(Nall);
				
				driver.findElement(By.linkText("Access all our Courses")).click();
			}
//			driver.close();

			
		}
	}

}
