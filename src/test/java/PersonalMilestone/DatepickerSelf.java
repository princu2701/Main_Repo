package PersonalMilestone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatepickerSelf {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		driver.findElement(By.cssSelector("[class='imgdp']")).click();
		
		
		 WebElement month = driver.findElement(By.className("ui-datepicker-month"));
		
	    	WebElement year = driver.findElement(By.className("ui-datepicker-year"));
	    	
	    	String date = month.getText();
	    	
	    	String yaa = year.getText();
		
       
		
		while (!(date.equals("January")&&yaa.equals("2003"))) {
			
			driver.findElement(By.className("ui-datepicker-prev")).click();
			
			date=driver.findElement(By.className("ui-datepicker-month")).getText();
			
			yaa= driver.findElement(By.className("ui-datepicker-year")).getText();
			
			
			
		}
		driver.findElement(By.xpath("//a[.='27']")).click();

		
		
		
		
		
		
				
				

	}

}
