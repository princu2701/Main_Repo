package PersonalMilestone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleTestNGCases {
	
	WebDriver driver ;
	
	@BeforeTest(alwaysRun = true)
	
	public void visit() {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
	
		}
	
	@Test()
	
	public void searchphone() {
		
		driver.findElement(By.id("gh-ac")).sendKeys("Phones");
		
		driver.findElement(By.id("gh-btn")).click();
		
		
	}
	
	@Test()
	
	public void searchtv() {
		
		driver.findElement(By.id("gh-ac")).clear();
		
		driver.findElement(By.id("gh-ac")).sendKeys("TV");
		
		driver.findElement(By.id("gh-btn")).click();
		
		
	}
	
	@Test ()
	
	public void searchtablet(){
		
         driver.findElement(By.id("gh-ac")).clear();
		
		driver.findElement(By.id("gh-ac")).sendKeys("Tablets");
		
		driver.findElement(By.id("gh-btn")).click();
		
		
		
		
	}
	
	@Test()
	
	public void searchlaptop() {
		
		  driver.findElement(By.id("gh-ac")).clear();
			
			driver.findElement(By.id("gh-ac")).sendKeys("Laptop");
			
			driver.findElement(By.id("gh-btn")).click();
		
		
	}
	
	@Test 
	
	public void facilities() {
		
		
	}
	
	@Test
	public void categories() {
		
		
	}
	
	@AfterMethod(alwaysRun = true)
	
	public void finalstage() {
		
		
		driver.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
