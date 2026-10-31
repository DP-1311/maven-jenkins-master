package generic_utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility {

	public void action(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		WebElement wEle=driver.findElement(By.xpath("//input[@type='submit']"));
		act.click(wEle).build().perform();	
	
	}
}