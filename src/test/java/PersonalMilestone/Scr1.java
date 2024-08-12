package PersonalMilestone;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scr1 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		TakesScreenshot ttScreenshot=(TakesScreenshot) driver;
		
		File first = ttScreenshot.getScreenshotAs(OutputType.FILE);
		
		File save = new File("C:\\Users\\Prince Raj\\OneDrive\\Documents\\iMPORTANT SCRNSHTS\\Origin\\pp12.png");
		
		FileUtils.copyFile(first, save);
		
		
		
		

	}

}
