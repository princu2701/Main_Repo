package Self;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver prince= new FirefoxDriver();
		
		prince.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		
		prince.findElement(By.id("alertBox")).click();
		
		prince.switchTo().alert().accept();
		
		prince.findElement(By.id("confirmBox")).click();
		
		prince.switchTo().alert().dismiss();
		
		prince.findElement(By.cssSelector("[onclick='promptFunction()']")).click();
		
		prince.switchTo().alert().sendKeys("Prince Raj");
		
		prince.switchTo().alert().accept();
		

	}

}
