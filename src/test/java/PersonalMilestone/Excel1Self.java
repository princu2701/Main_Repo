package PersonalMilestone;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel1Self {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.facebook.com/");
		
		FileInputStream excelinput= new FileInputStream("C:\\Users\\Prince Raj\\OneDrive\\Documents\\Driven\\Data2.xlsx");
		
		Workbook ddriven = WorkbookFactory.create(excelinput);
		
		String usernameString= ddriven.getSheet("Sheet1").getRow(6).getCell(0).getStringCellValue();
		
		String passwordString =ddriven.getSheet("Sheet1").getRow(6).getCell(1).getStringCellValue();
		
		driver.findElement(By.cssSelector("[id='email']")).sendKeys(usernameString);
		
		driver.findElement(By.cssSelector("[id='pass']")).sendKeys(passwordString);
		
		driver.findElement(By.cssSelector("[type='submit']")).click();

	}

}
