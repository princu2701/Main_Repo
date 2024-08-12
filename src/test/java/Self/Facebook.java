package Self;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.cssSelector("[name=\"firstname\"]")).sendKeys("don");
		
		driver.findElement(By.cssSelector("[name=\"lastname\"]")).sendKeys("humai");
		
		driver.findElement(By.cssSelector("[name=\'reg_email__\']")).sendKeys("7070576629");
		
		driver.findElement(By.cssSelector("[data-type=\'password\']")).sendKeys("11223344");
		
		WebElement date = driver.findElement(By.cssSelector("[id=\"day\"]"));
		
		Select s = new Select(date);
		
		s.selectByValue("2");
		
		Thread.sleep(2000);
		
		WebElement mon = driver.findElement(By.cssSelector("[title=\'Month\']"));
		
		Select s2=new Select(mon);
		
		s2.selectByIndex(2);
		
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.cssSelector("[name=\'birthday_year\']"));
		
		Select s3=new Select(year);
		
		s3.selectByVisibleText("2003");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@name=\'sex\'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Already have an account?")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.google.com");
		
		driver.close();
		
		}

}
