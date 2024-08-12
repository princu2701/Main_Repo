package Assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelScript1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream Assess = new FileInputStream("C:\\Users\\Prince Raj\\OneDrive\\Documents\\Driven\\Assignment1.xlsx");
		
		Workbook fileaccess = WorkbookFactory.create(Assess);
		
		String user = fileaccess.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		String pass = fileaccess.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		driver.findElement(By.cssSelector("[aria-label='Phone number, username, or email']")).sendKeys(user);
		
		driver.findElement(By.cssSelector("[aria-label='Password']")).sendKeys(pass);
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
		
		

	}

}
