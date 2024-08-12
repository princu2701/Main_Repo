package PersonalMilestone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupsSelf {
	
	WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	
	public void start() {
		
		driver= new FirefoxDriver();
		
		
		driver.get("https://www.ebay.com/");
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
  @Test(groups = "smoke")
  
  public void test1() {
	  
	  
	  driver.findElement(By.id("gh-ac")).sendKeys("iphone",Keys.ENTER);
	  
	  
	  }
  
  @Test 
  
  public void test2() {
	  
	  
	  driver.findElement(By.id("gh-ac")).sendKeys("trolley",Keys.ENTER);
	  
	  
  }
  
  @Test
  
  public void test3() {
	  
	  
	  driver.findElement(By.id("gh-ac")).sendKeys("earphones",Keys.ENTER);
	  
	  
  }
  
  @Test(groups = "smoke")
  public void test4() {
	  
	  
	  driver.findElement(By.id("gh-ac")).sendKeys("boat",Keys.ENTER);
	  
	  
	  
	
}
  
  @AfterMethod(alwaysRun = true)
  
  
  public void teardown() throws InterruptedException {
	  
	  Thread.sleep(2000);
	  
	  driver.close();
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
