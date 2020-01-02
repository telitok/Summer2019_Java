package day61_ExcelReadWrite;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// import org.apache.poi.ss.usermodel.*;  ==> We can just do this one instead of all the above imports

public class ExcelRead {
	
	public static void main(String[] args) throws Exception {
		
		String filePath = "/Users/tugbaelitok/Desktop/TestData.xlsx";
		String sheetname = "Sheet1";  // Name of the sheet
		
		FileInputStream file = new FileInputStream(filePath);  // to read the file
		
		Workbook excelFile = WorkbookFactory.create(file);  // specifically designed for excel file
	//  XSSWorkbook excelfile2 = new XSSWorkbook(file);   => We could use this one as wee, does the same thing.	
		
		Sheet sheet = excelFile.getSheet(sheetname); // gets the specific sheet from the excel file
	//  XSSFSheet sheet2 = new 	XSSWorkbook(file);  // does the same thing
		
		Cell cell = sheet.getRow(1).getCell(0);  // retrieves specific cell from the spread sheet, prints Tugba
		
		String cellData = cell.getStringCellValue(); // converts the cell's value to String data type
		// String cellData = cell.toString();  => Java's String conversion, this can be used as well
		
		System.out.println(cellData);
	}

}
