package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadSingleData {

	public static void main(String[] args) throws IOException {
		 FileInputStream File = new FileInputStream("C:\\Users\\bhaskar\\Desktop\\Book1.xlsx");
		 XSSFWorkbook  workBook = new XSSFWorkbook(File);
		 XSSFSheet Sheet = workBook.getSheet("Sheet1");
		 Row row=Sheet.getRow(0);
		 Cell cell= row.getCell(0);
		 String data=cell.getStringCellValue();
		 System.out.println(data);
		 
		 
		 
		 

	}

}
