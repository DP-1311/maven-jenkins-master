package object_repository_saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "checkout")
	private WebElement checkOut;

	public WebElement getcheckOut() {
		return checkOut;
	}
}