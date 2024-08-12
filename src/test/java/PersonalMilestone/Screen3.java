package PersonalMilestone;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen3 {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		
		TakesScreenshot scr= driver;
		
		File ooo = scr.getScreenshotAs(OutputType.FILE);
		
		File copy = new File("C:\\\\Users\\\\Prince Raj\\\\OneDrive\\\\Documents\\\\iMPORTANT SCRNSHTS\\\\Origin\\opoo.png");
		
		FileUtils.copyFile(ooo, copy);
		
		
		
		

	}

}
