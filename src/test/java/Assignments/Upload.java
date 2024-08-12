package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		driver.findElement(By.cssSelector("[type='file']")).sendKeys("C:\\Users\\Prince Raj\\OneDrive\\Desktop\\SampleFile.txt");
		
		
		 driver.findElement(By.cssSelector("[title='Upload selected files']")).click();

		
		

	}

}
