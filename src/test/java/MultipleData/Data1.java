package MultipleData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver=new FirefoxDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
	}
	
	
	@Test(dataProvider = "data")
	public void login(String username,String password) {
		
		driver.findElement(By.id("username")).sendKeys(username);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.cssSelector(".radius")).click();
		
	}
	
	@DataProvider(name = "data")
	public Object[][] data(){
		
		return new Object[][] {
			
			new Object[] {"tommy","aspiring"},
			
			new Object[] {"tommo","s!!!!!!"},
			
			new Object[] {"tummu","ssuu12233rr"},
			
			new Object[] {"Koma","Koms"},
			
			new Object[] {"tomsith","@@@@@@"},
			
			new Object[] {"tomsmith","SuperSecretPassword"},
			
		};
		
	}
	
	@AfterMethod
	
	public void teardown() {
		
		driver.close();
		
	}

}
