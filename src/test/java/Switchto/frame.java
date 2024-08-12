package Switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/iframes");
		
		WebElement fr = driver.findElement(By.cssSelector("[src='/selenium/frame1']"));
		
		driver.switchTo().frame(fr).findElement(By.cssSelector("[class='ui inverted red button']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.cssSelector("#actionButton")).click();
		
		driver.close();
	

	}

}
