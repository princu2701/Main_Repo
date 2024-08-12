package PersonalMilestone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Selfdprovider {
	
	WebDriver driver;
	
	@BeforeMethod 
	
	public void start() {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "data")
	
	public void first(String username,String password) {
		
		driver.findElement(By.cssSelector("[id='email']")).sendKeys(username);;
		
		driver.findElement(By.cssSelector("[id='pass']")).sendKeys(password);;
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}
	
	@DataProvider(name="data")
	
	public Object[][] data(){
		
		return new Object[][] {
			
			new Object[] {"princeraj","1122334455"},
			new Object[] {"pri@##",""},
			new Object[] {"infeinc==","grgrgrgrrFEDDDVDDCDCDCD"},
			new Object[] {"+_+_+_+_+_+","<><><><><>"},
			new Object[] {"))))))((((((",""},
			new Object[] {"QAQAAQWDDEDEDDDE","IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII"},
			new Object[] {"KIKIKIKIKI","00990099"},
			new Object[] {"8579886073","princeraj2701"},
			};
	}
	
	@AfterMethod
	
	public void end() throws InterruptedException {
		
		Thread.sleep(5000);
		
		driver.close();
		
	}
	
	

}
