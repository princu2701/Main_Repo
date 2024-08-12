package Switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String td = driver.findElement(By.xpath("(//table)[1]/tbody/tr[3]/td[2]")).getText();
		
		if(td.equals("Learn SQL in Practical + Database Testing from Scratch")) {
			
			System.out.println("Okk!!");
		}

	}

}
