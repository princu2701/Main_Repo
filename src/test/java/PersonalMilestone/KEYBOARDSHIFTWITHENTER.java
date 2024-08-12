package PersonalMilestone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KEYBOARDSHIFTWITHENTER {

	public static void main(String[] args) {
		
		try{WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		WebElement pr = driver.findElement(By.cssSelector("[id='gh-ac']"));
		
		Actions actions= new Actions(driver);
		
		
		//actions.keyDown(pr, Keys.SHIFT).sendKeys("PrinceRaj").keyUp(pr, Keys.SHIFT).build().perform();
		pr.sendKeys("PrinceRaj");
		actions.keyDown(pr, Keys.ENTER).keyUp(pr, Keys.ENTER).build().perform();
		} catch (Exception e) {
		}

	}

}
