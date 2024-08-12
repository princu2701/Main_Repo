package PersonalMilestone;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen2 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		
		File sc2 = screenshot.getScreenshotAs(OutputType.FILE);
		
		File Saveit = new File("C:\\Users\\Prince Raj\\OneDrive\\Documents\\iMPORTANT SCRNSHTS\\Origin\\op.jpeg");
		
		FileUtils.copyFile(sc2, Saveit);
		
		
		
		

	}

}
