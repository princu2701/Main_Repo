package Switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nestediframe {

	public static void main(String[] args) throws InterruptedException {

		
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/nested-iframes");
		
		WebElement parent = driver.findElement(By.xpath("//iframe[@src='/selenium/nested-iframe1']"));
		
		driver.switchTo().frame(parent);
		
		WebElement child1 = driver.findElement(By.xpath("(//iframe[@src='/selenium/frame1'])"));
		
		driver.switchTo().frame(child1).findElement(By.cssSelector("#actionButton")).click();
				
		driver.switchTo().defaultContent();
		
		WebElement child2 = driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']"));
		
		driver.switchTo().frame(child2).findElement(By.id("actionButton")).click();
		
		
		
		
		driver.close();
		
		
	}

}
