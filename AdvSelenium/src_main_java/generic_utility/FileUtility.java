package generic_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {

	public static String getDataFromPropertiesFile(String key) throws IOException {

		// Creating JRO of the Physical File
		FileInputStream fis = new FileInputStream("./src/test/resources/Properties.properties");

		// Loading all the keys by using load method which comes from Properties class
		// of Java
		Properties pObj = new Properties();
		pObj.load(fis);

		// Getting the Value by Loading all the keys by using getProperty Method which
		// is also comes from Properties class of Java

//		String URL=pObj.getProperty("url");
//		System.out.println(URL);
//		String UN=pObj.getProperty("username");
//		System.out.println(UN);
//		String PWD=pObj.getProperty("password");
//		System.out.println(PWD);

		String value = pObj.getProperty(key);
		return value;

	}

	public static String getDataFromExcelFile(String sheetname, int rowIndex, int cellIndex)
			throws EncryptedDocumentException, IOException {

		FileInputStream fiss = new FileInputStream("./src/test/resources/NewEtt.xlsx");

		Workbook wb = WorkbookFactory.create(fiss);

		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowIndex);
		Cell cell = row.getCell(cellIndex);
		String value = cell.getStringCellValue();
		return value;
	}

}
