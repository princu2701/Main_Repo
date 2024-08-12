package PersonalMilestone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerWithFrame {

	public static void main(String[] args) {
		
		WebDriver mileDriver=new FirefoxDriver();
		
		mileDriver.get("https://jqueryui.com/datepicker/");
		
		WebElement pr = mileDriver.findElement(By.cssSelector("[class=\'demo-frame\']"));
		
		mileDriver.switchTo().frame(pr).findElement(By.cssSelector(".hasDatepicker")).sendKeys("01/27/2003",Keys.ENTER);
		
		
		

	}

}
