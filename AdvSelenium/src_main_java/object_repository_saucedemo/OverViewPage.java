package object_repository_saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverViewPage {

	
	public OverViewPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[normalize-space()='SauceCard #31337']")
	private WebElement review;
	
	@FindBy(id="finish")
	private WebElement finishButton;
	
	
	public WebElement getReview() {
		return review;
	}
	
	public WebElement getButton() {
		return finishButton;
	}
}
