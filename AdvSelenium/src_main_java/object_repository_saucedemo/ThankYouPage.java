package object_repository_saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouPage {

	public ThankYouPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[normalize-space()='Thank you for your order!']")
	private WebElement thanks;
	
	public WebElement getThanks() {
		return thanks;
	}
}
