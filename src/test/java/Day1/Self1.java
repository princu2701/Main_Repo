package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Self1 {
	
	public static void main(String[] args) {
		
		WebDriver prince = new FirefoxDriver();
		
		prince.get("https://the-internet.herokuapp.com/login");
		
		prince.findElement(By.name("username")).sendKeys("tomsmith");
		
		prince.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		
		prince.findElement(By.cssSelector("button[type='submit']")).click();
		
		prince.findElement(By.cssSelector("a[class='button secondary radius']")).click();
	}

}
