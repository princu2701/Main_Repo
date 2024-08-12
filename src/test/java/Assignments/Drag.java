package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		TakesScreenshot tssScreenshot= (TakesScreenshot) driver;
		
		File take = tssScreenshot.getScreenshotAs(OutputType.FILE);
		
		File save= new File("C:\\Users\\Prince Raj\\OneDrive\\Documents\\iMPORTANT SCRNSHTS\\Origin\\Special.png");
		
		FileUtils.copyFile(take, save);		
		
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		
		
		Actions actions = new Actions(driver);
		
		
		WebElement launch = driver.findElement(By.cssSelector("#draggable"));
		
		
		WebElement Tar = driver.findElement(By.cssSelector("#droppable"));
		
		
		actions.dragAndDrop(launch, Tar).build().perform();
		
		TakesScreenshot tssScreenshot2= (TakesScreenshot) driver;
		
		
        File take2 = tssScreenshot2.getScreenshotAs(OutputType.FILE);
        
		
		File save2= new File("C:\\Users\\Prince Raj\\OneDrive\\Documents\\iMPORTANT SCRNSHTS\\Origin\\Special2.png");
		
		
		FileUtils.copyFile(take2, save2);
		
		
		
		
		
		

	}
	

}
