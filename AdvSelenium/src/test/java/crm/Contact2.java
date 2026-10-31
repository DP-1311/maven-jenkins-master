package crm;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, ParseException {

		// Common Data

		FileReader fr = new FileReader("./src/test/resources/JSON.json");

		JSONParser parse = new JSONParser();
		Object obj = parse.parse(fr);

		JSONObject jObj = (JSONObject) obj;

		String URL = jObj.get("url").toString();
		System.out.println(URL);
		String UN = jObj.get("username").toString();
		System.out.println(UN);
		String PWD = jObj.get("password").toString();
		System.out.println(PWD);

		// Test Script Data

		FileInputStream fiss = new FileInputStream("./src/test/resources/TestScript.xlsx");

		Workbook wb = WorkbookFactory.create(fiss);
		Sheet sh = wb.getSheet("TestScript");
		Row row = sh.getRow(0);
		Cell cell = row.getCell(2);
		String value = cell.getStringCellValue();
		System.out.println(value);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(UN);
		driver.findElement(By.name("user_password")).sendKeys(PWD);
		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.xpath("//*[text()='Contacts']")).click();
		driver.findElement(By.xpath("//*[@alt='Create Contact...']")).click();

		driver.findElement(By.name("lastname")).sendKeys(value);

		driver.findElement(By.name("button")).click();

		// driver.close();

	}

}