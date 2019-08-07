package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_MultipleData_Excel {

	public static void main(String[] args) throws IOException {
		 FileInputStream File= new FileInputStream("C:\\Users\\bhaskar\\Desktop\\Multiple_Test_Data.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(File);
		 XSSFSheet sheet = workbook.getSheet("Sheet1");
		 int rowcount=sheet.getLastRowNum();
		 System.out.println(rowcount);
		 for(int i=0;i<rowcount;i++)
		 {
		 Row row=sheet.getRow(i);
		int cellcount= row.getLastCellNum();
		 for(int k=0;k<cellcount;k++)
		 {
			Cell cell=row.getCell(k);
			String data=cell.getStringCellValue();
			System.out.print(data+"  ");
		 }
		 System.out.println();
		 }
		 
		 
		 

	}

}
