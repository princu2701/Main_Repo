package Self;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		driver.findElement(By.className("imgdp")).click();
		
		Thread.sleep(2000);
		
		WebElement Month = driver.findElement(By.cssSelector("[class='ui-datepicker-month']"));
		
		WebElement Year = driver.findElement(By.cssSelector(".ui-datepicker-year"));
		
		
		String month = Month.getText();
		
		String year = Year.getText();
		
		while (!(month.equals("January")&& year.equals("2003"))) {
			
			driver.findElement(By.cssSelector("[data-handler='prev']")).click();
			
			month=driver.findElement(By.cssSelector("[class='ui-datepicker-month']")).getText();
			
			year=driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
			
			}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='ui-state-default' and .='27']")).click();
		
		driver.close();
		

	}

}
