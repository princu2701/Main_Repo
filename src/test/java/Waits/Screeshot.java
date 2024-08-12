package Waits;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

;

public class Screeshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		TakesScreenshot tScreenshot= (TakesScreenshot) driver;
		
		File take = tScreenshot.getScreenshotAs(OutputType.FILE);
		
		File saveFile= new File("C:\\Users\\Prince Raj\\OneDrive\\Documents\\iMPORTANT SCRNSHTS\\Origin\\pr1.png");
		
		FileUtils.copyFile(take, saveFile);
		
		
		
		
		

	}

}
