package BrokenLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloads {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
		driver.findElement(By.linkText("Download")).click();
		
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("prince1");
		
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();
		
		driver.findElement(By.xpath("//a[@id='link-to-download']")).click();
		
		driver.findElement(By.xpath("//textarea[@id='pdfbox']")).sendKeys("prince2");
		
		driver.findElement(By.xpath("//button[@id='createPdf']")).click();
		
		driver.findElement(By.xpath("//a[@id='pdf-link-to-download']")).click();
		
		

	}

}
