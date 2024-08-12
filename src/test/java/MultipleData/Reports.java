package MultipleData;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports {
	
	WebDriver driver;
	
	ExtentReports first;
	
	ExtentTest test;
	
	
	@BeforeClass
	
	public void report() {
		
		
		first = new ExtentReports("C:\\Users\\Prince Raj\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\Sel1\\number1.html");
		
		test = first.startTest("First Extenet Report");
		
		
	}
	
	@BeforeMethod(alwaysRun = true)
	
	public void Start() {
		
         driver = new FirefoxDriver();
         
         test.log(LogStatus.PASS, "The Browser has been opened");
         
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.ebay.com/");
		
		test.log(LogStatus.PASS, "Site Reached");
		
		
		
		
		
	}
	
	@Test
	
	public  void search() {
		
	
		
		//test.log(LogStatus.PASS, "Reached the Search Box");
		
		WebElement pr = driver.findElement(By.id("gh-ac"));
		
		pr.sendKeys("iphone",Keys.ENTER);
		
		test.log(LogStatus.PASS, "IPhone has been Searched");
		
}
	
	
	@Test
	public  void search2() {
		
	
	//test.log(LogStatus.PASS, "Again Seaching for the new product");
		
		WebElement pr = driver.findElement(By.id("gh-ac"));
		
		pr.sendKeys("Desktop",Keys.ENTER);
		
		test.log(LogStatus.PASS, "Destop Searching Done");
		

		
		
	}
	
	@Test
	
   public  void search3() {
		
	
		
           //test.log(LogStatus.PASS, "The coming product is Samsung");
		
		WebElement pr = driver.findElement(By.id("gh-ac"));
		
		pr.sendKeys("Samsung",Keys.ENTER);
		

		test.log(LogStatus.PASS, "Searching Done");
	
}
	
	@AfterMethod(alwaysRun = true)
	
	public void last() throws InterruptedException {
		
		Thread.sleep(2000);
		
		test.log(LogStatus.PASS, "Everything is Done");
		
		//driver.close();
		
	}
	
	
	@AfterClass
	
	public void fnal() {
		
		first.flush();
		
		first.endTest(test);
		
	
		
		
	}

}
