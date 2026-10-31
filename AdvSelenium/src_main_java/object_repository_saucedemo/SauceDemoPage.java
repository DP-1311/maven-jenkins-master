package object_repository_saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoPage {
	
	
	public SauceDemoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
//	WebElement usernameField = driver.findElement(By.id("user-name"));
//	WebElement passwordField = driver.findElement(By.id("password"));
//	WebElement loginButton = driver.findElement(By.id("login-button"));
	
	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}
}
