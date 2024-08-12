package BrokenLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLink {

	public static void main(String[] args) {
		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> pr = driver.findElements(By.tagName("a"));
		
		for (WebElement link : pr) {
			
			String Url = link.getAttribute("href");
			
		
			try {
				if(Url!=null) {
					
					driver=new FirefoxDriver();
					
					driver.get(Url);
					
					String title= driver.getTitle();
					
					if(title.contains("402")||title.contains("Error")||title.contains("502")||title.isEmpty()) {
						
						System.out.println("This is a broken one"+ Url);
					}
					else {
						
					} System.out.println("Not Broken , These are valid Ones => " +Url);
					
				}
				
			} catch (Exception e) {
				
				
			}
			driver.close();
			
			
			}
		  driver.quit();
	}

}
