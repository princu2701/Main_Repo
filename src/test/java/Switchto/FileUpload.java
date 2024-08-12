package Switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		
		WebDriver prince= new FirefoxDriver();
		
		prince.get("https://demo.guru99.com/test/upload/");
		
		
		 prince.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\Prince Raj\\OneDrive\\Desktop\\Test Plans\\TESTPLAN.docx");
		 
		 prince.findElement(By.cssSelector("[name='send']")).click();
		 
		
		
		
		

	}

}
