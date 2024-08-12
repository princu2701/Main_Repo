package PersonalMilestone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CAlenderClicks {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		driver.findElement(By.cssSelector("[class=\'imgdp\']")).click();
		
		WebElement month = driver.findElement(By.className("ui-datepicker-month"));
		
		WebElement yaer = driver.findElement(By.className("ui-datepicker-year"));
		
		String mon = month.getText();
		
		String yeah = yaer.getText();
		
		while (!(mon.equals("January")&&yeah.equals("2003"))) {
			
			driver.findElement(By.cssSelector(".ui-datepicker-prev ")).click();
			
			mon=driver.findElement(By.className("ui-datepicker-month")).getText();
			
			yeah=driver.findElement(By.className("ui-datepicker-year")).getText();
			
		}
		driver.findElement(By.xpath("//a[.=\'27\']")).click();
		
		

	}

}
