package com.DateAndTime;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Date_TimeForWorldClock {
	WebDriver driver=null;
	@BeforeTest
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@AfterTest
	public void setDown()
	{
		driver.quit();
	}
	@Test
	public void getColData()
	{
		List<WebElement>Names=driver.findElements(By.tagName("a"));
		int CNC=Names.size();
		System.out.println(CNC);
		for(int i=0;i<CNC;i++)
		{
		String	countryNames=Names.get(i).getText();
		System.out.println(countryNames);
		}
	}

}
