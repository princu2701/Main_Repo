package PersonalMilestone;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentSelf {
	
	WebDriver driver;
	
	ExtentReports reports;
	
	ExtentTest test;
	
	@BeforeClass
	
	public void report() {
		
		reports = new ExtentReports("C:\\Users\\Prince Raj\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\Sel1\\self.html");
		
		test = reports.startTest("Lets Do it");
		
	}
	
	@BeforeMethod
	public void start() {
		
		driver= new FirefoxDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.ebay.com/");
		
		test.log(LogStatus.PASS, "Browser Process has been done");
		
	}
	
	@Test
	
	public void test1() {
		
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("D Box",Keys.ENTER);
		
		 //driver.findElement(By.cssSelector("[aria-label='JBL']")).click();
		
		if(driver.findElement(By.cssSelector("[type='text']")).getText().equals("Dj Box")) {
		 
		 test.log(LogStatus.PASS, "Jbl done");
		} else {
			
			test.log(LogStatus.FAIL, "Something wrong Occured");
		}
	
		
		}
	
	@Test
	
	public void test2() {
		
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("Bikes",Keys.ENTER);
		
		//driver.findElement(By.cssSelector("[aria-label='BMX Bike']")).click();

		 test.log(LogStatus.PASS, "Kids Job done");
		
		
      
		}
	
	@AfterMethod
	
	public void done() throws InterruptedException {
		
		Thread.sleep(5000);
		
		
		
		driver.close();
		
		test.log(LogStatus.PASS, "Work Done");
		
	}
	
	@AfterClass
	
	public void last() {
		
		reports.flush();
		
		reports.endTest(test);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
