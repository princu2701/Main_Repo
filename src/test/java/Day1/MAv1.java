package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MAv1 {
	
	public static void main(String[] args) {
		
		WebDriver Dry= new FirefoxDriver();
		Dry.get("https://www.google.com");
		
//		WebDriver D2 =new EdgeDriver();
//		D2.get("")
		
//		WebDriverManager.safaridriver().setup();
		
		
	}

}
