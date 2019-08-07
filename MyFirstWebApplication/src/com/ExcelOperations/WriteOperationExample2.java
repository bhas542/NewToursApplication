package com.ExcelOperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class WriteOperationExample2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "./Driver Files/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
	WebElement	Country=driver.findElement(By.name("country"));
	List<WebElement>CountryNames=Country.findElements(By.tagName("option"));
	int CountryCounts=CountryNames.size();
	System.out.println(CountryCounts);
		
		
		  
		 XSSFWorkbook wb = new XSSFWorkbook();
		 XSSFSheet sheet= wb.createSheet("Sheet3");
		  
		 for(int i=0;i<CountryCounts;i++)
	     {
			 //int   k=0;
	    	 String CountryName=CountryNames.get(i).getText();
	    	 
	    	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    	 //XSSFSheet Sheet= wb.createSheet("Sheet0");
	    	  Row row=sheet.createRow(i);
	    	   
	    		  Cell cell=row.createCell(i); 
	    		  cell.setCellValue(CountryName);
	    		  FileOutputStream fos = new FileOutputStream("C:\\Users\\bhaskar\\Desktop\\Book1.xlsx");
	    	 
	          //Cell cell=row.createCell(0);
	          //cell.setCellValue(CountryName);
	          wb.write(fos);
	          System.out.println(CountryName);
	     }
		 
		  
	 /*
		       		Row		row	=sheet.createRow(0);
		       		Cell			cell		= row.createCell(1);
		                        cell.setCellValue("hekNfj");
		                        wb.write(fos); */
		                        
		       		
		 

	}

}
