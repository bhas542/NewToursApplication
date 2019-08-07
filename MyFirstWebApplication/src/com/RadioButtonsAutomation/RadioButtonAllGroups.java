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

public class RadioButtonAllGroups {
	WebDriver driver=null;
	@BeforeTest
	public void setUp()
	{
		//WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
  @AfterTest
	public void setDown()
	{
		driver.quit();
	}
  @Test
  public void code()
  {
	  WebElement Radio_Buttons=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
	  List<WebElement>RC1=Radio_Buttons.findElements(By.name("group1"));
	  
	  List<WebElement>RC2=Radio_Buttons.findElements(By.name("group2"));
	 int radgrp1=RC1.size();
	 int radgrp2=RC2.size();
	  List<WebElement>radioButtonCount=Radio_Buttons.findElements(By.tagName("input"));
	  int radioButtonNumber=radioButtonCount.size();
	  System.out.println(radgrp1);
	  System.out.println(radgrp2);
	  System.out.println("Total radio Elements "+radioButtonNumber);
	  for(int i=0;i<radioButtonNumber;i++)
	  {
		  
		  String RBN=radioButtonCount.get(i).getAttribute("value");
		  System.out.println(RBN);
		  radioButtonCount.get(i).click();
		  
		  if(i>=4)
		  {
			  String RB2=radioButtonCount.get(i).getAttribute("value");
			  System.out.println(RB2);
			  radioButtonCount.get(i).click();
			  for(int j=i;j<radioButtonNumber;j++)
			  {
				  System.out.println(radioButtonCount.get(j).getAttribute("value")+ " " +radioButtonCount.get(j).isSelected()  );
			  }
		  }
		  for(int k=0;k<radioButtonNumber;k++)
		  {
			  System.out.println(radioButtonCount.get(k).getAttribute("value")+ " " +radioButtonCount.get(k).isSelected()  );
			  
		  }
		  
		  System.out.println(RBN);
	  }
	 
	  
	  
  }
  
  
	
}
