package PersonalMilestone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/tables");
		
		String pr = driver.findElement(By.xpath("(//table)[2]/tbody/tr[2]/td[2]")).getText();
		
		if(pr.equals("Approved")) {
			
			System.out.println("My name is Prince");
		}

	}

}
