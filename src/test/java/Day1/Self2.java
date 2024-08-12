package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Self2 {
	
	public static void main(String[] args) {
		
		WebDriver prince = new ChromeDriver();
		
		prince.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
        prince.findElement(By.name("username")).sendKeys("Admin");
		
		prince.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
		
		prince.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
