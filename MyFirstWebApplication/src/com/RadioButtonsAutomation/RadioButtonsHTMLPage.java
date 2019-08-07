package com.RadioButtonsAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButtonsHTMLPage {
	WebDriver driver=null;
	
	@BeforeTest
	public void setUp()
	{
		 
		System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterTest
	public void setDown()
	{
		driver.quit();
	}
	@Test
	public void codeOperation()
	{
		WebElement radio_Buttons=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
	List<WebElement>RC=radio_Buttons.findElements(By.name("group2"));
	int radioCount=RC.size();
	System.out.println(radioCount);
	for(int i=0;i<radioCount;i++)
	{
		//RC.get(i).click();
		String radioButtonName=RC.get(i).getAttribute("value");
		RC.get(i).click();
		System.out.println(radioButtonName);
		for(int j=0; j<radioCount;j++)
		{
			System.out.println(RC.get(j).getAttribute("value")+"    " +RC.get(j).isSelected());
		 
		}
	}
	}
	
	

}
