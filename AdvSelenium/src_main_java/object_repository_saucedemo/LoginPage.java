package object_repository_saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	private WebElement Username;

	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(id="login-button")
	private WebElement LoginButton;
	
	
	public WebElement getUsername() {
		return Username;
	}
	
	public WebElement getPassword() {
		return Password;
	}
	
	public WebElement getLoginButton() {
		return LoginButton;
	}
	
}