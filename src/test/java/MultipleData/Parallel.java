package MultipleData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Parallel {
	
	WebDriver driver;
	
	WebDriver driver2;
	
	@Test
	
	public void chrome() {
		
		driver= new ChromeDriver();
		
		driver.get("https://www.bstackdemo.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		
	}
	@Test
	public void firefox() {
		
		driver2= new FirefoxDriver();
		
		driver2.get("https://www.bstackdemo.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver2.getTitle());
		
	}
	
	@AfterMethod
	public void cls() {
		
		driver.quit();
		
		driver2.quit();
	}
	
	

}
