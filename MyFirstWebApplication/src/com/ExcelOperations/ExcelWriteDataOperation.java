package com.ExcelOperations;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteDataOperation {

	public static void main(String[] args) throws IOException {
		//XSSFWorkbook WorkBook = new XSSFWorkbook(File);
		 
  FileOutputStream File = new FileOutputStream("C:\\Users\\bhaskar\\Desktop\\Book1.xlsx");
	 
  XSSFWorkbook WorkBook = new XSSFWorkbook();
  XSSFSheet Sheet = WorkBook.createSheet();
	Row row = Sheet.createRow(2);
	Cell cell= row.createCell(3);
	cell.setCellValue("LiveTech");
	WorkBook.write(File);
	 
	 

	}

}
