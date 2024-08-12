package PersonalMilestone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DependsooSelf {
	
	WebDriver driver ;
	
	@BeforeTest
	
	public void start() {
		
		driver= new FirefoxDriver();
		
		driver.get("https://www.ebay.com/");
		
	}
	
	@Test
	
	public void test1() {
		
		driver.findElement(By.cssSelector("[placeholder='Search for anything']")).sendKeys("Iphone");
		
		driver.findElement(By.cssSelector("#gh-btn")).click();
		
		
	}
	
	@Test
	
	public void test2() {
		
		driver.findElement(By.cssSelector("[placeholder='Search for anything']")).sendKeys("Samsung");
		
		driver.findElement(By.cssSelector("#gh-btn")).click();
		
		
	}
	
	@Test(dependsOnMethods = "test1")
	public void test3() {
		
				
		driver.findElement(By.cssSelector("[aria-label='Unlocked']")).click();
		
		
		
		
		
	}
	
	@AfterTest
	
	public void fl() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
