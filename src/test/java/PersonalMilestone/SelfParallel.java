package PersonalMilestone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SelfParallel {
	
	WebDriver driver;
	
	WebDriver driver2;
	
	

	
	@Test
	
	public void test1() {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
        driver= new ChromeDriver();
        
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.cssSelector("[id='email']")).sendKeys("8579886073");
		
		
		driver.findElement(By.cssSelector("[id='pass']")).sendKeys("princeraj2701");
		
		
		driver.findElement(By.cssSelector("[name='login']")).click();
		
		
//		driver.findElement(By.xpath("(//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z'])[1]")).click();
//		
//		
//		driver.findElement(By.cssSelector("[id=':r1u:']")).click();
//		
		
		
		
	}
	
	@Test
	
	public void test2() throws InterruptedException {
		//driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver2=  new FirefoxDriver();
		
		
		driver2.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		Thread.sleep(2000);
		
		
		driver2.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
		
		
		driver2.findElement(By.cssSelector("[name='password']")).sendKeys("admin123");
		
		
		driver2.findElement(By.cssSelector("[type='submit']")).click();
		
		
		}
	
	@AfterMethod
	
	public void close() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
