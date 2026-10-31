package base_utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import generic_utility.FileUtility;

public class BaseClass {

	WebDriver driver;
	public static WebDriver sdriver;
	
	@BeforeClass
	public void setUp() throws IOException {
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get(FileUtility.getDataFromPropertiesFile("url"));
	
	}
	
	
	public void login() {
		
		
	}
	
	
	public void logOut() {
		
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	
	
}
