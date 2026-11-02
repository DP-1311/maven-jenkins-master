package crm;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_utility.FileUtility;
import generic_utility.JavaUtility;
import generic_utility.WebDriverUtility;
import object_repository.ContactPage;

public class ContactTest {

//	private static final CharSequence value = null;
//	private static final CharSequence val = null;


//	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

	@Test
	public void contactTest() throws EncryptedDocumentException, IOException, InterruptedException {	
//-------------------------- Common Data--------------------------
		
//------------- Before Generic Utility -->File Utility-------------
		
//		FileInputStream fis = new FileInputStream("./src/test/resources/Properties.properties");
//
//		Properties pObj = new Properties();
//		pObj.load(fis);
		
//		String URL = pObj.getProperty("url");
//		System.out.println(URL);
//		String UN = pObj.getProperty("username");
//		System.out.println(UN);
//		String PWD = pObj.getProperty("password");
//		System.out.println(PWD);

//-------------After Generic Utility-->File Utility-------------	
		
		String URL=FileUtility.getDataFromPropertiesFile("url");
		String UN=FileUtility.getDataFromPropertiesFile("username");
		String PWD=FileUtility.getDataFromPropertiesFile("password");
		
//--------------------------Test Script Data--------------------------

//------------- Before Generic Utility -- File Utility -------------
		
//		FileInputStream fiss = new FileInputStream("./src/test/resources/TestScript.xlsx");

//		Workbook wb = WorkbookFactory.create(fiss);
//		Sheet sh = wb.getSheet("TestScript");
//		Row row = sh.getRow(0);
//		Cell cell = row.getCell(2);
//		String value = cell.getStringCellValue();
//		System.out.println(value);

		
//------------- After Generic Utility-->File Utility------------------		

// Java Utility
		
//		CharSequence[] date=JavaUtility.getTodaysDateTime();
		
		int number=JavaUtility.generateRandomNumber();
		
		String exl= FileUtility.getDataFromExcelFile("Cars", 3, 1) + number;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get(URL);
		
//----------------- Before POM ----------------------------------------------
		
//		driver.findElement(By.name("user_name")).sendKeys(UN);
//		driver.findElement(By.name("user_password")).sendKeys(PWD);
//		driver.findElement(By.id("submitButton")).click();
//
//		driver.findElement(By.xpath("//*[text()='Contacts']")).click();
//		driver.findElement(By.xpath("//*[@alt='Create Contact...']")).click();

//----------------- After POM ----------------------------------------------
		
		ContactPage cp=new ContactPage(driver);
		
		WebElement username=cp.getUsername();
		username.sendKeys(UN);
		WebElement password=cp.getPassword();
		password.sendKeys(PWD);
		WebElement subBtn=cp.getButton();
		subBtn.click();
		WebElement contact=cp.getContact();
		contact.click();
		WebElement contactClick=cp.getCreatecontact();
		contactClick.click();
		 
//		WebElement fnEle=driver.findElement(By.name("firstname"));	
		WebElement firstname=cp.getFirstName();
		
//		fnEle.sendKeys(date); // Java Utility date class
//		firstname.sendKeys(date);
		
		driver.findElement(By.name("lastname")).sendKeys(exl);
//		System.out.println(exl);
		
		Reporter.log("Output is: "+exl, true);
		
		Thread.sleep(3000);
		
// Before WebDriver Utility		
//		Actions act = new Actions(driver);
//		WebElement wEle=driver.findElement(By.xpath("//input[@type='submit']"));
//		act.click(wEle).build().perform();
//
// After WebDriver Utility		
		WebDriverUtility wdUtil=new WebDriverUtility();
		
		WebElement wEle = null;
		wdUtil.action(driver, wEle);
		
		// driver.close();

	}

}