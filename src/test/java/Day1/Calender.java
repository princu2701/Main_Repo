package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		//driver.findElement(By.cssSelector(".hasDatepicker")).sendKeys("01/27/2023",Keys.ENTER);

		//driver.close();
		
		//2nd Approach
		
		
		
		
		driver.findElement(By.cssSelector(".hasDatepicker")).click();
		
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		
		WebElement year = driver.findElement(By.cssSelector(".ui-datepicker-year"));
		
		String monthtext=month.getText();
		
		String yeartext = year.getText();
		
		while (!(monthtext.equals("January") && yeartext.equals("2003"))) {
			
			driver.findElement(By.cssSelector(".ui-datepicker-prev")).click();
			
			
			monthtext=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			yeartext=driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
			
			
			
			
		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='ui-state-default' and .='27']")).click();
		
		
	}
	

}
