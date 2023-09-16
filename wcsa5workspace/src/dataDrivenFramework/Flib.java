package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public  String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath); // file,file
		
		Workbook wb = WorkbookFactory.create(fis);  //input stream 
	    Sheet sheet = wb.getSheet(sheetName); // String argument
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
	}
//it is use to get last count of row where we store data
	public int getLastRowCount(String excelPath, String sheetName) throws EncryptedDocumentException,IOException
	{
	FileInputStream fis = new  FileInputStream(excelPath); //provide the path of file
	Workbook wb = WorkbookFactory.create(fis);//make the file for ready to read
	Sheet sheet = wb.getSheet(sheetName);//get into the sheet
	int rc = sheet.getLastRowNum();//read the last row
	return rc;
	}
	//it is use to write the data into excel sheet
	
	public void writeExcelData(String excelPath,String sheeName, int rowCount, int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
	Workbook wb = WorkbookFactory.create(fis);  //make the file for ready to read
	Sheet sheet = wb.getSheet(data);         //get into the sheet
	Row row = sheet.getRow(rowCount); //pass the row count
	Cell cell = row.createCell(cellCount); //pass the cell count
	cell.setCellValue(data); //pass the string argument as data
	
	FileOutputStream fos = new FileOutputStream(excelPath);
	wb.write(fos);
	}
	

}
