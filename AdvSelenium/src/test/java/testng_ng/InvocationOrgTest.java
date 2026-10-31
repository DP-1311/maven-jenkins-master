package testng_ng;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import static org.testng.Assert.assertTrue;

//import org.testng.Assert;

import org.testng.annotations.Test; 

public class InvocationOrgTest {

	@Test (invocationCount=2, threadPoolSize=2) //
	public void createOrgTest() {
		WebDriver driver = new ChromeDriver();
		System.out.println("Created qSpiders");
	}

	@Test (dependsOnMethods="createOrgTest", invocationCount=3)
	public void modifyOrgTest() {
//		assertTrue(true);
		assertTrue(false);
		System.out.println("Modify qSpiders");
	}

	@Test (invocationCount=2, alwaysRun=true, enabled=false)
	public void deleteOrgTest() {
		WebDriver driver = new ChromeDriver();
		System.out.println("Delete qSpiders");

	}

}
