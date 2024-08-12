package BrokenLinks;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDriven1 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		
		FileInputStream fileInputStream= new FileInputStream("C:\\Users\\Prince Raj\\OneDrive\\Documents\\Driven\\Data1.xlsx");
		
		
		Workbook workbook= WorkbookFactory.create(fileInputStream);
		
		
		String username = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		
		String password = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		
		driver.findElement(By.cssSelector("[name='email']")).sendKeys(username);
		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
		
		driver.findElement(By.cssSelector("[name='login']")).click();
		
		workbook.close();
		
		
		
		
		
		
		
		
		
		

	}

}
