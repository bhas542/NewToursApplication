package com.DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class loginTestCase extends BaseClassDataDriven {
	@Test
	public void login() throws IOException
	{
		FileInputStream fis= new FileInputStream("C:\\Users\\bhaskar\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook workBook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workBook.getSheet("Sheet1");
		int rowsCount=sheet.getLastRowNum();
		System.out.println(rowsCount);
		for(int i=1;i<=rowsCount;i++)
		{
		Row	rows= sheet.getRow(i);
		WebElement userName=driver.findElement(By.name("userName"));
		userName.sendKeys(rows.getCell(0).getStringCellValue());
		WebElement password=driver.findElement(By.name("password"));
	     password.sendKeys(rows.getCell(1).getStringCellValue());
	     driver.findElement(By.name("login")).click();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	    String expectedLoginTitle="Find";
	    System.out.println("The expected Login Title is: "+expectedLoginTitle );
	    //String actual_Title=driver.getTitle();
	    System.out.println("the actual title "+driver.getTitle());
	    if(driver.getTitle().contains(expectedLoginTitle))
	    {
	    	System.out.println("the result--- PASS ");
	       rows.createCell(2).setCellValue("PASS");
	       driver.navigate().back();
	    }
	    else
	    {
	    	System.out.println("the login failed --FAIL");
	    	rows.createCell(2).setCellValue("FAIL");
	    }
	    
		
	    FileOutputStream fos= new FileOutputStream("C:\\Users\\bhaskar\\Desktop\\DataDrive2.xlsx");
	    workBook.write(fos);
	    //driver.navigate().back();
		}
		
   
	}
	

}
