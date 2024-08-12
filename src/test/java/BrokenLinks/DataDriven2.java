package BrokenLinks;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		FileInputStream FStream = new FileInputStream("C:\\Users\\Prince Raj\\OneDrive\\Documents\\Driven\\Data1.xlsx");
		
		Workbook Insert = WorkbookFactory.create(FStream);
		
		String usernm = Insert.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		
		String pass = Insert.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		

		driver.findElement(By.cssSelector("[name='email']")).sendKeys(usernm);
		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		
		
		driver.findElement(By.cssSelector("[name='login']")).click();
		
		
		Insert.close();
		
		
		
		
		

	}

}
