package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic {

	public static void main(String[] args) throws InterruptedException {
		
		
WebDriver prince = new FirefoxDriver();
		
		prince.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		prince.findElement(By.cssSelector("input[placeholder=\'Type to Select Countries\']")).sendKeys("ja");
		
		Thread.sleep(2000);
		
		List<WebElement> Dyn = prince.findElements(By.cssSelector(".ui-menu-item"));
		
		
		
		for (WebElement opt : Dyn) {
			
			if(opt.getText().equals("Japan")) {
				
				System.out.println(opt.getText());
				
				opt.click();
			}
			
		}
		
		

	}

}
