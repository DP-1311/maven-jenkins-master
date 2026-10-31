package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	
	
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//	driver.findElement(By.name("user_name")).sendKeys(UN);
//	driver.findElement(By.name("user_password")).sendKeys(PWD);
//	driver.findElement(By.id("submitButton")).click();
//
//	driver.findElement(By.xpath("//*[text()='Contacts']")).click();
//	driver.findElement(By.xpath("//*[@alt='Create Contact...']")).click();

// 	WebElement fnEle=driver.findElement(By.name("firstname"));
	
	@FindBy(name="user_name")
	private WebElement username;
	
	@FindBy(name="user_password")
	private WebElement password;
	
	@FindBy(id="submitButton")
	private WebElement Button;
	
	@FindBy(xpath="//*[text()='Contacts']")
	private WebElement contact;
	
	@FindBy(xpath="//*[@alt='Create Contact...']")
	private WebElement createcontact;
	
	@FindBy(name="firstname")
	private WebElement firstname;
	
	public WebElement getUsername() {
		return username;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getButton() {
		return Button;
	}
	
	public WebElement getContact() {
		return contact;
	}
	
	public WebElement getCreatecontact() {
		return createcontact;
	}
	
	public WebElement getFirstName() {
		return firstname;
	}
	
}
