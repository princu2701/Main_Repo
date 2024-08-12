package Self;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class framehandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		WebElement pr = driver.findElement(By.xpath("(//iframe)[3]"));
		
		driver.switchTo().frame(pr);
		
		 WebElement sle = driver.findElement(By.xpath("(//select[@id=\'selectnav2\'])[1]"));
		 
		 Select prSelect =new Select(sle);
		 
		 prSelect.selectByVisibleText("Home");
		 
		 driver.switchTo().defaultContent();
		 
		 WebElement pr2 = driver.findElement(By.cssSelector("[id=\'frm2\']"));
		 
		 driver.switchTo().frame(pr2);
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("#englishchbx")).click();
		 
		 driver.close();
		
		

	}

}
