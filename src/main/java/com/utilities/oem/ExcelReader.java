package com.utilities.oem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader  {

	public static void  readExcelData(String filePath , String sheetname) throws EncryptedDocumentException, IOException {
		

	try {
		FileInputStream 	File = new FileInputStream(filePath);
		Workbook wb  =  WorkbookFactory.create(File) ;
		Sheet sheet = wb.getSheet(sheetname);
       int rowcount = sheet.getPhysicalNumberOfRows();
       int colCount = sheet.getRow(0).getLastCellNum();
       
       System.out.println("read the excelsheetpath"+filePath);
       System.out.println("read the excelsheetname"+sheetname);
       System.out.println("--------------------------------------");
       
       for(int i =0; i <rowcount ; i++) {
    	          Row row = sheet.getRow(i);
    	          for(int j=0; j<colCount; j++){
    	        	Cell cell = row.getCell(j);
    	        	 String value = cell != null ? cell.toString() : "";
                     System.out.print(value + "\t");
    	          }
    	          System.out.println();
    	          
    	         wb.close();
    	         File.close();
       }
       
	} catch (IOException e) {
		
		e.printStackTrace();
		 System.out.println("Error reading Excel file: " + e.getMessage());
	}
		
	

		
}
	
	 public  static void main(String agar []) throws EncryptedDocumentException, IOException {
		 String FilePath = "C:\\Users\\SYAA TECH\\eclipse-workspace\\OEMDeshTopProject\\data\\bulkdata1test.xlsx";
		 String sheetName = "Devices";
		 ExcelReader.readExcelData(FilePath, sheetName);
	 }
}
