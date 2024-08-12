package MultipleData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGassert {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver= new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Asserting TItle
		
		String origin = driver.getTitle();
		
		String expected = "Practice Page";
		
		//Hard Assertion is done through Assert.assertequals(axtual,expected)
		
		Assert.assertEquals(origin, expected);
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://rahulshettyacademy.com/AutomationPractice/");
		
		//Assert Url
		
		String test = driver.getCurrentUrl();
		
		boolean no = test.contains("AutomationPractice");
		
		//Assert through boolean
		
		Assert.assertTrue(no);
		
	}
	
	@Test
	
	public void test1() {
		
		//Assering RadioButton
		
		WebElement radio = driver.findElement(By.cssSelector("[value='radio1']"));
		
		System.out.println(radio.isDisplayed());
		
		Assert.assertTrue(radio.isDisplayed());
		
		radio.click();
		
		System.out.println(radio.isDisplayed());
		
		Assert.assertTrue(radio.isSelected());
		
		System.out.println(radio.isSelected());
		
	
		//Asserting Text
		
		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		
		String texttrial = driver.findElement(By.cssSelector(".top-left")).getText();
		
		Assert.assertEquals(texttrial, "contact@rahulshettyacademy.com");
		
		
		
		
	}
	
	@Test
	
	public void test2() {
		
		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		
		SoftAssert sAssert= new SoftAssert();
		
		sAssert.assertEquals(driver.getTitle(),"documents-request");
		
		//
		sAssert.assertAll();

		
		
	}
	
	
	@AfterMethod(alwaysRun = true)
	
	public void lasted() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
	


