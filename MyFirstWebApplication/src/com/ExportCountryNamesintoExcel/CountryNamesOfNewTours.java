package com.ExportCountryNamesintoExcel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountryNamesOfNewTours {

	public static void main(String[] args) throws IOException, InterruptedException {
		  FileOutputStream File = new FileOutputStream("C:\\Users\\bhaskar\\Desktop\\Book1.xlsx");
		//FileOutputStream fos = new FileOutputStream((‪"C:\\Users\\bhaskar\\Desktop\\CountryList.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		 
		
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "./Driver Files/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
	WebElement	Country=driver.findElement(By.name("country"));
	List<WebElement>CountryNames=Country.findElements(By.tagName("option"));
	int CountryCounts=CountryNames.size();
	System.out.println(CountryCounts);
     for(int i=0;i<CountryCounts;i++)
     {
    	 String CountryName=CountryNames.get(i).getText();
    	 
    	 Thread.sleep(10000);
    	 XSSFSheet Sheet= wb.createSheet("Sheet0");
    	  Row row=Sheet.createRow(i);
          Cell cell=row.createCell(0);
          cell.setCellValue(CountryName);
          wb.write(File);
          System.out.println(CountryName);
     }
      
    		 //(‪"C:\\Users\\bhaskar\\Desktop\\CountryList.xlsx");
      // XSSFSheet Sheet= wb.createSheet("Sheet1");
       
    //   for(int k=0;k<)
       //Row row=Sheet.createRow(0);
       //Cell cell=row.createCell(0);
       //cell.setCellValue("DDDD");
      // wb.write(File);
       
       
       
     
     
     
     

	}

}
