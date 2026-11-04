package pom_extra;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_utility.FileUtility;
import object_repository_saucedemo.CheckoutPage;
import object_repository_saucedemo.HomePage;
import object_repository_saucedemo.InfoPage;
import object_repository_saucedemo.LoginPage;
import object_repository_saucedemo.OverViewPage;
import object_repository_saucedemo.ThankYouPage;

public class SauceDemoTest {

	@Test
	public void sauceDemo() throws InterruptedException, IOException {
	
//	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//		Doubt: Why FileUtility.getDataFromPropertiesFile not giving autosuggestion 
//		       for key urlSauceDemo when we are passing key in brackets ? 
		
		
// 		Note: Variable name can be anything either url_sauceDemo or url	as mentioned below

// 		Generic Utility Code for URL	
		
//		String url_sauceDemo=FileUtility.getDataFromPropertiesFile("urlSauceDemo");
//		driver.get(url_sauceDemo);
			
		String url=FileUtility.getDataFromPropertiesFile("urlSauceDemo");
		driver.get(url);
		
//------------------------- Login Page -------------------------	
		
		LoginPage lp=new LoginPage(driver);
		
		WebElement username=lp.getUsername();
		WebElement password=lp.getPassword();
		WebElement loginButton=lp.getLoginButton();
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginButton.click();
		
		Thread.sleep(3000);
		
// ------------------ Home Page -------------------------------
		
		HomePage hp=new HomePage(driver);
		
		WebElement add=hp.getaddEle();
		WebElement cart=hp.getcartEle();
		
		add.click();
		cart.click();
		
		Thread.sleep(3000);

// ------------------ CheckOut Page -------------------------------
				
		CheckoutPage cop=new CheckoutPage(driver);
		
		WebElement checkout=cop.getcheckOut();
		checkout.click();
		
// ------------------ Info Page -------------------------------
		
		InfoPage ip = new InfoPage(driver);
		
		WebElement firstName=ip.getFirstName();
		WebElement lastName=ip.getlastName();
		WebElement postCode=ip.getpostCode();
		WebElement button=ip.getContinueButton();
		
		Thread.sleep(5000);
		
		firstName.sendKeys("Sauce");
		lastName.sendKeys("Demo");
		postCode.sendKeys("11111");
		button.click();
		
		Thread.sleep(3000);
		
// ------------------ OverView Page -------------------------------
		
		OverViewPage ovp=new OverViewPage(driver);
		
		WebElement review=ovp.getReview();
		WebElement btn=ovp.getButton();
		
		String rev= review.getText();
		
		if(rev.equals("SauceCard #31337")) {
			Reporter.log("Product Added Successfully", true);
		}
		
		btn.click();
		
//-------------------- Thank You Page -------------------------	
		
		ThankYouPage typ = new ThankYouPage(driver);
		
		WebElement tks=typ.getThanks();		
		
		String thanks=tks.getText();
		
		if(thanks.equals("Thank you for your order!")) {
			Reporter.log("Order Placed Succesfully", true);
		}
		
		
	}

}
