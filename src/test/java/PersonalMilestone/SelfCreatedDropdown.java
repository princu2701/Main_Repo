package PersonalMilestone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelfCreatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.cssSelector("[aria-label='Search for anything']")).sendKeys("Samsung");
		
		Thread.sleep(2000);
		
		List<WebElement> pr = driver.findElements(By.cssSelector(".ui-menu-item"));
		
		Thread.sleep(2000);
		
		for (WebElement opt : pr ) {
			
			if (opt.getText().equals("samsung galaxy s24 ultra")) {
				
				
				
				opt.click();
			}
			
		}

	}

}
