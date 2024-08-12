package Self;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Self1 {

	public static void main(String[] args) {
		
		
        WebDriver prince = new FirefoxDriver();
		
		prince.get("https://www.ebay.com/");
		
		prince.findElement(By.id("gh-ac")).sendKeys("Phone");
		
		prince.findElement(By.cssSelector("input[value='Search']")).click();
		
		prince.findElement(By.xpath("(//span[@class=\'checkbox cbx x-refine__multi-select-checkbox undefined\'])[1]")).click();
		
		prince.findElement(By.xpath("(//span[@class=\'checkbox cbx x-refine__multi-select-checkbox undefined\'])[1]")).click();

		prince.findElement(By.cssSelector("input[data-value=\'Worldwide\']")).click();

	}

}
