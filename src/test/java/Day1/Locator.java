package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.className("ui-autocomplete-input")).sendKeys("Prince Raj");
		
//		Thread.sleep(2000);
		
		driver.findElement(By.id("autocomplete")).clear();
		
		driver.findElement(By.id("autocomplete")).sendKeys("Raj");
		
		driver.findElement(By.cssSelector("input[value='radio1']")).click();
		
		
		
		
		
	}

}
