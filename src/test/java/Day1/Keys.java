package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys {

	public static void main(String[] args) {

          
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		Actions actions = new Actions(driver);
		
		WebElement pr = driver.findElement(By.id("email"));
		
		actions.keyDown(pr,org.openqa.selenium.Keys.SHIFT).sendKeys("prince").keyUp(pr,org.openqa.selenium.Keys.SHIFT).build().perform();
		
		WebElement pr2 = driver.findElement(By.id("pass"));
		
		//actions.keyDown(pr2,org.openqa.selenium.Keys.SHIFT).sendKeys("princeraj1122").keyDown(pr2, org.openqa.selenium.Keys.SHIFT).build().perform();
		
	//To delete element written in box 	
		String pass = "princeraj2222";
				
				pr2.sendKeys(pass);
		
		for (int i=0; i<pass.length();i++) {
			
			actions.keyDown(pr2,org.openqa.selenium.Keys.BACK_SPACE).keyUp(pr2,org.openqa.selenium.Keys.BACK_SPACE).build().perform();
		}
		
		
		
	}

}
