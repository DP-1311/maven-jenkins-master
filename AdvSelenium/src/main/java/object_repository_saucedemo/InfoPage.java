package object_repository_saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InfoPage {

	public InfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first-name")
	private WebElement firstname;

	@FindBy(id = "last-name")
	private WebElement lastname;

	@FindBy(id = "postal-code")
	private WebElement postcode;

	@FindBy(id="continue")
	private WebElement button;
	
	public WebElement getFirstName() {
		return firstname;
	}

	public WebElement getlastName() {
		return lastname;
	}

	public WebElement getpostCode() {
		return postcode;
	}
	
	public WebElement getContinueButton() {
		return button;
	}
}
