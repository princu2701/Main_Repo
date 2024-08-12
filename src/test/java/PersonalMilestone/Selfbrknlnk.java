package PersonalMilestone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selfbrknlnk {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> multiples = driver.findElements(By.tagName("a"));
		
		for (WebElement singles : multiples) {
			
			String urlString= singles.getAttribute("href");
			
			try {
				
				if (urlString!= null) {
					
					driver = new FirefoxDriver();
					
					driver.get(urlString);
					
					String titleString=driver.getTitle();
					
					if (titleString.contains("402")|| titleString.contains("Error")||titleString.isEmpty()) {
						
						System.out.println("These are the broken links => "+ urlString);
						
					} else {
						System.out.println("These are fine ones => " + urlString);
					}
				}
				
			} catch (Exception e) {
				
			}
			
		}
		driver.close();

	}

}
