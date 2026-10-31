package object_repository_saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement addEle;
	
	@FindBy(className="shopping_cart_badge")
	private WebElement cartEle;
	
	public WebElement getaddEle() {
		return addEle;
	}
	
	public WebElement getcartEle() {
		return cartEle;
	}
	
}