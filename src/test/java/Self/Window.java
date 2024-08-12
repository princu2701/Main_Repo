package Self;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Window {
	
	
	    public static void main(String[] args) throws InterruptedException {
	       
	        WebDriver driver = new FirefoxDriver();

	        driver.get("https://the-internet.herokuapp.com/login");

	        driver.findElement(By.linkText("Elemental Selenium")).click();
	        
	        for (String pr : driver.getWindowHandles()) {
	        	
	        	if(!pr.equals(driver.getWindowHandle())) {
	        		
	        		driver.switchTo().window(pr);
	        		
	        		Thread.sleep(2000);
	        		
	        		WebElement si1 = driver.findElement(By.cssSelector("[id='email']"));
	        		
	        		si1.sendKeys("princeraj1122@gmail.com");
	        		
	        		WebElement si2 = driver.findElement(By.cssSelector("[id='options']"));
	        		
                   Select opSelect= new Select(si2);
                   
                   opSelect.selectByVisibleText("Java");
                   
                  driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
	        		
	        	}
				
			}
	        driver.navigate().to("https://the-internet.herokuapp.com/login");
	        
	        driver.findElement(By.cssSelector("[name='username']")).sendKeys("tomsmith");
	        
	        driver.findElement(By.cssSelector("[name='password']")).sendKeys("SuperSecretPassword!");
	        
	        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
	        
	        
	       
	        

	       
	    }
	}


	
		

	

	


