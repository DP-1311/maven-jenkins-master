package ddt_extra;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExcel_1 {

	public static void main(String[] args) throws IOException {
		
		// Create JRO of the Physical File
		FileInputStream fiss = new FileInputStream("./src/test/resources/NewEtt.xlsx");
		
		// To open the excel file will use create method.
		
		// Note: Create method will not create anything it will use to open/access
		// the excel file only
		Workbook wb = WorkbookFactory.create(fiss);
			
		// Get the access of the Sheet.
		Sheet sh = wb.getSheet("Cars");
		
		// Get the access of the Row.
		Row row = sh.getRow(3);
		//System.out.println(row);
		
		// Get the access of the Cell
		Cell cell = row.getCell(1);
		
		// Get the value of the cell
		String value = cell.getStringCellValue();
		System.out.println(value);
		
	}
}