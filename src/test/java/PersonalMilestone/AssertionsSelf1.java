package PersonalMilestone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsSelf1 {
	
	WebDriver driver;
	
	
	@BeforeMethod
	
	public void start() {
		
		driver= new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		
		
		
	}
	
	@Test
	
	public void test1() {
		
		
		//Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
		
	}
	
	@Test 
	
	public void test2() {
		
		//Assert.assertEquals(driver.getTitle(),"Electronics, Cars, Fashion, Collectibles & More | eBay");
		
	}
	
	@Test
	
	public void test3() {
		
		SoftAssert sAssert= new SoftAssert();
		
		sAssert.assertAll();
		
	}
	
	
	@AfterMethod
	
	public void last() {
		
		driver.close();
		
	}
	
	
	
	

}
