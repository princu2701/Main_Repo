package PersonalMilestone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/selects");
		
		WebElement pr = driver.findElement(By.cssSelector("[id='single-select']"));
		
		Thread.sleep(2000);
		
		Select s1=new Select(pr);
		
		s1.selectByValue("3");
		
		

	}

}
