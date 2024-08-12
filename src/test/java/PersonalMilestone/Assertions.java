package PersonalMilestone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertions {
	
	WebDriver driver ;
	
	
	@BeforeMethod
	public void name() {
		
		driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		driver.manage().window().maximize();
		
		
		
		driver.getCurrentUrl();
		
		
		
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test
	
	public void test1() {
		
		
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
		
		
		
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("admin123");
		
		
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		}
	
	
	@AfterMethod
	
	
	public void end() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
