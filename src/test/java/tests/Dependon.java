package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dependon {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void entry() {
		
		driver= new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void search1() {
		
    driver.findElement(By.id("gh-ac")).sendKeys("iphone");;
    
	driver.findElement(By.cssSelector("#gh-btn")).click();

		
		
		
	}
	@Test
	
	public void search2() {
		
		driver.findElement(By.id("gh-ac")).clear();
		
		  driver.findElement(By.id("gh-ac")).sendKeys("Samsung");
		    
			driver.findElement(By.cssSelector("#gh-btn")).click();
		
	}
	@Test(dependsOnMethods = "search1")
	public void check() {
		
		driver.findElement(By.cssSelector("[aria-label='128 GB']")).click();
		
		driver.findElement(By.cssSelector("[aria-label='AT&T']")).click();
		
	}
	
	@AfterTest
	
	public void last() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
