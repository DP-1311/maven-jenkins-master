package testng_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SauceDemoDataProviderTest {

	@Test(dataProvider = "getCredentials")
	public void TestCredentials(String username, String password) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		
//		driver.quit();
	
	}

	@DataProvider
	public Object[][] getCredentials() {

		Object[][] cred = new Object[6][2];

		cred[0][0] = "standard_user";
		cred[0][1] = "secret_sauce";

		cred[1][0] = "locked_out_user";
		cred[1][1] = "secret_sauce";

		cred[2][0] = "problem_user";
		cred[2][1] = "secret_sauce";

		cred[3][0] = "performance_glitch_user";
		cred[3][1] = "secret_sauce";

		cred[4][0] = "error_user";
		cred[4][1] = "secret_sauce";

		cred[5][0] = "visual_user";
		cred[5][1] = "secret_sauce";

		return cred;

	}
}