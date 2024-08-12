package PersonalMilestone;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleScr1 {
	
	public static void capture(WebDriver driver,int n) throws IOException {
		
		
		TakesScreenshot sdScreenshot = (TakesScreenshot) driver;
		
		File mul = sdScreenshot.getScreenshotAs(OutputType.FILE);
		
		File path = new File("C:\\Users\\Prince Raj\\OneDrive\\Documents\\iMPORTANT SCRNSHTS\\Origin\\jj"+ n +".png");
		
		FileUtils.copyFile(mul, path);
		
		
		
		
		
		
	}

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		capture(driver,1);
		
		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		
		
		
		

	}

}
