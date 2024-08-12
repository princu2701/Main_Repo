package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	
	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		
		Actions actions = new Actions(driver);
		
		//Locator for source
		
		WebElement pr = driver.findElement(By.cssSelector("#draggable"));
		
		
		//locator for target
		
		WebElement pr2 = driver.findElement(By.cssSelector("#droppable"));
		
		actions.dragAndDrop(pr, pr2).build().perform();
		
		//WebElement pr3 = driver.findElement(By.cssSelector("#droppable"));
		
		WebElement pr4 = driver.findElement(By.id("dropzone2"));
		
		actions.dragAndDrop(pr2, pr4).build().perform();
		
		
		
		
		
		
				
	
}
	
}
