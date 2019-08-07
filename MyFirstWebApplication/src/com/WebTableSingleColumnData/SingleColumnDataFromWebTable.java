package com.WebTableSingleColumnData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SingleColumnDataFromWebTable {
	WebDriver driver=null;
	@BeforeTest
public void setUP()
{
	 
	System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.timeanddate.com/worldclock/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
}
@AfterTest
public void shutDown()
{
	driver.quit();
}
@Test
public void testCase()
{
	String part1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	String part2="]/td[3]/a";
	for(int i=1;i<=36;i++)
	{
WebElement	Element=driver.findElement(By.xpath(part1+i+part2));

String Data=Element.getText();
System.out.println(i+" "+Data);
	}
}

}
