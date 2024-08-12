package PersonalMilestone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SelfDataProvider {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void start() {
		
		driver= new FirefoxDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider = "data")
	public void test1(String username,String password) {
		
		driver.findElement(By.cssSelector("[name='username']")).sendKeys(username);
		
		driver.findElement(By.cssSelector("[name='password']")).sendKeys(password);
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
	}
	
	@DataProvider(name="data")
	
	public Object[][] data(){
		
		return new Object[][] {
			
			new Object[] {"['[;]'[;;/.,/","00000000000000000"},
			
			new Object[] {"11223344","12121233821"},
			
			new Object[] {"Princeraj",""},
			
			new Object[] {"Underscroe","@@@@@@@@@@@@"},
			
			new Object[] {"","ASASASASASASASASA"},
			
			new Object[] {"thruehhs","dh vbeffdehfsd"}
		};
	}
	
	@AfterMethod
	
	public void teardown() {
		
		
		
		driver.close();
	}

}
