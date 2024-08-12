package PersonalMilestone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) {
		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@title=\'Search for Products, Brands and More\']")).sendKeys("Dove Shampoo",Keys.ENTER);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[src='https://rukminim2.flixcart.com/image/612/612/xif0q/shampoo/d/l/f/-original-imagzt9v3m5nx7qa.jpeg?q=70']")));
		
		driver.findElement(By.cssSelector("[src='https://rukminim2.flixcart.com/image/612/612/xif0q/shampoo/d/l/f/-original-imagzt9v3m5nx7qa.jpeg?q=70']")).click();

	}

}
