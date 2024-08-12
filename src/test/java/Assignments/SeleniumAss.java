package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumAss {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.ebay.com/");
		
		WebElement some = driver.findElement(By.cssSelector("[id='gh-ac']"));
		
		some.sendKeys("Shoes",Keys.ENTER);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1600)\r\n");
		
		driver.navigate().back();
		
		driver.close();
		
		
		
		
		
		
		

	}
	

	

		public static void main1(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			
			driver.get("https://www.snapdeal.com/");
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("document.getElementById('inputValEnter').value='clothes'\r\n");
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='searchTextSpan']")));
			
			WebElement Search = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
			
			js.executeScript("arguments[0].click();",Search);
			
			
			
			
		
			

		}

	}



