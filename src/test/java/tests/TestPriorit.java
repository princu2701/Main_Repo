package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPriorit {
	WebDriver driver ;
	@BeforeMethod
	
	public void Start() {
		
         driver = new FirefoxDriver();
         
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.ebay.com/");
		
		
		
		
	}
	
	@Test(priority=2)
	
	public  void search() {
		
	
		
		//Actions actions = new Actions(driver);
		
		WebElement pr = driver.findElement(By.id("gh-ac"));
		
		pr.sendKeys("iphone",Keys.ENTER);
		
		//actions.keyDown(pr, Keys.ENTER).keyUp(pr, Keys.ENTER).build().perform();

		
		
	}
	
	
	@Test(priority = 0)
	public  void search2() {
		
	
		
		//Actions actions = new Actions(driver);
		
		WebElement pr = driver.findElement(By.id("gh-ac"));
		
		pr.sendKeys("Desktop",Keys.ENTER);
		
		//actions.keyDown(pr, Keys.ENTER).keyUp(pr, Keys.ENTER).build().perform();

		
		
	}
	
	@Test(priority = 1)
	
   public  void search3() {
		
	
		
		//Actions actions = new Actions(driver);
		
		WebElement pr = driver.findElement(By.id("gh-ac"));
		
		pr.sendKeys("Samsung",Keys.ENTER);
		
		//actions.keyDown(pr, Keys.ENTER).keyUp(pr, Keys.ENTER).build().perform();
	
	
}
	
	@AfterMethod
	
	public void last() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.close();
	}
}
