package com.CompleteWebTableData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
 
public class BaseClass {
	WebDriver driver=null;
	@BeforeTest
	public void setUP()
	{
		 
		System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	@AfterTest
	public void shutDown()
	{
		driver.quit();
	}

}
