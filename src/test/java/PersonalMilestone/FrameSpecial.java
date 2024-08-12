package PersonalMilestone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSpecial {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		try {
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://v1.training-support.net/selenium/nested-iframes");
			
			driver.manage().window().maximize();
			
			WebElement pr = driver.findElement(By.cssSelector("[src='/selenium/nested-iframe1']"));
			
			driver.switchTo().frame(pr);
			
			WebElement pr2 = driver.findElement(By.cssSelector("iframe[src='/selenium/frame1']"));
			
			driver.switchTo().frame(pr2).findElement(By.id("actionButton")).click();
			
			driver.switchTo().defaultContent();
			
			WebElement pr3 = driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']"));
			
			driver.switchTo().frame(pr3).findElement(By.id("actionButton")).click();
					
			System.out.println("Mission Success");
			
			driver.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		

	}

}
