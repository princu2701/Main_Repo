package PersonalMilestone;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test
	
	public void Pr() throws EncryptedDocumentException, IOException {
		
		
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		
		FileInputStream FIS = new FileInputStream("C:\\Users\\Prince Raj\\OneDrive\\Documents\\Driven\\Data2.xlsx");
		
		
		Workbook Lile1 = WorkbookFactory.create(FIS);
		
		
		String username = Lile1.getSheet("Sheet1").getRow(6).getCell(0).getStringCellValue();
		
		
		String password = Lile1.getSheet("Sheet1").getRow(6).getCell(1).getStringCellValue();
		
		
	   driver.findElement(By.cssSelector("[name='email']")).sendKeys(username);
		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
		
		driver.findElement(By.cssSelector("[name='login']")).click();
		
		
	}

}
