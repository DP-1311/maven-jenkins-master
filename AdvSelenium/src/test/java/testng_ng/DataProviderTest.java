package testng_ng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider="getData")
	public void TestMethod(String username, String password) {
		System.out.println(username);
		System.out.println(password);
		
	}
	
	@DataProvider
	public Object[][] getData() { // Here, Get Data works as a Data Provider

		Object[][] creds = new Object[4][2];
//	num of row = num of execution or num of data 
//	num of col = num of parameters in @Test method

// Here, row shows the Username and column shows the password 
		
		creds[0][0] = "Harris";
		creds[0][1] = "Pass123";

		creds[1][0] = "Rajnish";
		creds[1][1] = "Pass321";

		creds[2][0] = "Aman";
		creds[2][1] = "Pass007";

		creds[3][0] = "Chris";
		creds[3][1] = "Pass012";
		
		return creds;

	}
}