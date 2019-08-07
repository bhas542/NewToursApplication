package com.DataDriven;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class BaseClassDataDriven {
	 
		WebDriver driver=null;
		@BeforeTest
		public void setUP()
		{
			 
			System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("http://newtours.demoaut.com/");
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
		}
		/*@AfterTest
		public void shutDown()
		{
			driver.quit();
		
	}*/

}
