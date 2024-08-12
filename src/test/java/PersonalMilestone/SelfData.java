package PersonalMilestone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SelfData {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void Start() {
		
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		}
	
	@Test(dataProvider ="data")
	
	public void main(String username,String password) {
		
		driver.findElement(By.cssSelector("[id='email']")).sendKeys(username);
		
		driver.findElement(By.cssSelector("[type='password']")).sendKeys(password);
		
		driver.findElement(By.cssSelector("[name='login']")).click();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("[id='email']")).clear();
		
		//driver.findElement(By.cssSelector("[type='password']")).clear();
	}
	
	
	@DataProvider(name="data")
	
	public Object[][] data() {
		
		return new Object[][] {
			
			new Object[] {"PrinceRaj1122","WowLooking"},
			
			new Object[] {"UniquesInterface","SomethingElse"},
			
			new Object[] {"LastName","Firstname"},
		};
		
	}
	
	@AfterTest
	
	public void End() throws InterruptedException {
		
		
		driver.close();
	}

}
