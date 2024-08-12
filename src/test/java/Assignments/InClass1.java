package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InClass1 {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void start() {
		
		driver= new ChromeDriver();
		
		driver.get("https://automationteststore.com/");
		
		String urltest = driver.getCurrentUrl();
		
		Assert.assertEquals(urltest, "https://automationteststore.com/");
		
	}
	
	@Test
	
	public void test1() {
		
		driver.findElement(By.linkText("Contact Us")).click();
		
		
		driver.findElement(By.cssSelector("[name='first_name']")).sendKeys("Prince");
		

		driver.findElement(By.cssSelector("#ContactUsFrm_email")).sendKeys("princeraj1122@gmail.com");
		
		
		driver.findElement(By.cssSelector("[name='enquiry']")).sendKeys("I need help regarding clothes");
		
		
		driver.findElement(By.cssSelector("[title='Submit']")).click();
		

		String cont = driver.findElement(By.cssSelector("[class='mb40']")).getText();
		
		
		Assert.assertEquals(cont,"Your enquiry has been successfully sent to the store owner!");
		
		}
	
	
	@AfterMethod
	
	public void last() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
