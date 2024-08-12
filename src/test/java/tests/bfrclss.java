package tests;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class bfrclss {

		WebDriver driver ;
		@BeforeClass
		
		public void Start() {
			
	         driver = new FirefoxDriver();
	         
	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.ebay.com/");
			
			
			
			
		}
		
		@Test
		
		public  void search() {
			
		
			
			//Actions actions = new Actions(driver);
			
			driver.findElement(By.id("gh-ac")).sendKeys("iphone");
			
			driver.findElement(By.cssSelector("#gh-btn")).click();
			
			
			
			//actions.keyDown(pr, Keys.ENTER).keyUp(pr, Keys.ENTER).build().perform();

			
			
		}
		
		
		@Test
		public  void search2() {
			
		
			
			//Actions actions = new Actions(driver);
			
            driver.findElement(By.id("gh-ac")).clear();

			WebElement pr = driver.findElement(By.id("gh-ac"));
			
			pr.sendKeys("Desktop",Keys.ENTER);
			
			//actions.keyDown(pr, Keys.ENTER).keyUp(pr, Keys.ENTER).build().perform();

			
			
		}
		
		@Test
		
	   public  void search3() {
			
		
			
			//Actions actions = new Actions(driver);
			
			 driver.findElement(By.id("gh-ac")).clear();
			
			WebElement pr = driver.findElement(By.id("gh-ac"));
			
			pr.sendKeys("Samsung",Keys.ENTER);
			
			//actions.keyDown(pr, Keys.ENTER).keyUp(pr, Keys.ENTER).build().perform();
		
		
	}
		
		@AfterClass
		
		public void last() throws InterruptedException {
			
			Thread.sleep(4000);
			
			driver.close();
		}
}
	

	
	


