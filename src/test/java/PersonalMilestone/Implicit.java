package PersonalMilestone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver.findElement(By.cssSelector("[src='https://rukminim2.flixcart.com/flap/96/96/image/71050627a56b4693.png?q=100']")).click();
		
		driver.findElement(By.cssSelector("[class='v2VFa- rLGgLC g9KxuM smJZop G+rzy6 z2D4XG']")).sendKeys("Bangalore");
		
		
		
		
		
		

	}

}
