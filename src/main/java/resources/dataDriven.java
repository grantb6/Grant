package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws IOException {
		
	//FileinputStream - To read data
    FileInputStream fis = new FileInputStream ("C:\\Users\\Babs\\Documents\\WebAutomation.xlsx");
	
	//Create object for the class - fis passed into the object to be able to read data
	XSSFWorkbook workbook = new XSSFWorkbook (fis);
		
	//To tell workbook to read only Sheet1 - testdata
	//Get count of sheets
	
	int sheets = workbook.getNumberOfSheets();
	
	for (int i = 0; i < sheets; i++)
		
		if (workbook.getSheetName(i).equalsIgnoreCase("testdata"))
		{
			
			XSSFSheet sheet = workbook.getSheetAt(i);
			
			//Identify test cases column by scanning entire 1st row
			//To iterate all the rows of the sheet
			//Sheet Iterator - To get the row count of the sheet
			Iterator <Row> rows = sheet.iterator();
			
			Row firstrow = rows.next();
			
			Iterator <Cell> ce = firstrow.cellIterator();
			
			int k = 0;
			int column = 0;
			
			//Cell Iterator - To iterate through all the rows
			
			while (ce.hasNext())
				
			{
				Cell value = ce.next();
				if (value.getStringCellValue().equalsIgnoreCase("Testcases"))
					
				{
					column = k;
				}
				
				k++;
			}
			System.out.println(column);
			
			//Once row is identified scan the entire testcase column to identify purchase row
			
			while (rows.hasNext())
				
			{
				Row r = rows.next();
				
				if (r.getCell(column).getStringCellValue().equalsIgnoreCase("Credentials"))
				
				{
					//To get all values of cells - use cell iterator
					
					Iterator <Cell> cv = r.cellIterator();
					
					while (cv.hasNext())
						
					{
						
					System.out.println(cv.next().getStringCellValue());
						
					}
		}
		
	}}}}

	


