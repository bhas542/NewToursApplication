package com.AutomateLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateLinksOfNewToursHomePage {

	public static void main(String[] args) {
	WebDriver driver=null;
	String url="http://newtours.demoaut.com/";
	 System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get(url);
	List<WebElement>Links=driver.findElements(By.tagName("a"));
	int LinksCount=Links.size();
System.out.println(LinksCount);
	for(int i=0;i<LinksCount;i++)
	{
	String	LinkName=Links.get(i).getText();
	System.out.println(LinkName);
Links.get(i).click();
		 
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		Links=driver.findElements(By.tagName("a"));
	}

	}

}
