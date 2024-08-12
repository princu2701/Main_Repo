package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpaths {
	
	public static void main(String[] args) {
		
		WebDriver prince =new ChromeDriver();
		
		prince.get("https://v1.training-support.net/selenium/simple-form");
		
		prince.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Prince");
		
		prince.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Raj");
		
	
	}

}
