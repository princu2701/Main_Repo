package Switchto;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("openwindow")).click();
		
		Thread.sleep(2000);
		
		String Single = driver.getWindowHandle();
		
		Set<String> All = driver.getWindowHandles();
		
		String title="QAClick Academy - A Testing Academy to Learn, Earn and Shine";
		
		for (String id : All) {
			
			driver.switchTo().window(id);
			
			if (driver.getTitle().equals(title)) {
				
				break;
			}
			
		}
		driver.findElement(By.linkText("Access all our Courses")).click();
		
		
		
		
	}

}
