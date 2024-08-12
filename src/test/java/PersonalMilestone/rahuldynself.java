package PersonalMilestone;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rahuldynself {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("[id='autocomplete']")).sendKeys("Po");
		
		//driver.findElement(By.xpath("(//div[.='Poland'])[1]")).click();
		
	
		
		List<WebElement> pr = driver.findElements(By.cssSelector(".ui-menu-item"));
		
		
		for (WebElement opt : pr) {
			
			if(opt.getText().equals("Poland")) {
				
				opt.click();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
