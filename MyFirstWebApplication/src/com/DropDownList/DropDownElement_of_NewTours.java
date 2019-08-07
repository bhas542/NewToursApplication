package com.DropDownList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownElement_of_NewTours {

	public static void main(String[] args) {
	WebDriver driver=null;
	System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.linkText("REGISTER")).click();
	WebElement Country=driver.findElement(By.name("country"));
	 List<WebElement>countries=Country.findElements(By.tagName("option"));
	 int CN=countries.size();
	 System.out.println(CN);
	 for(int i=0;i<CN;i++)
	 {
		 String coun_Name=countries.get(i).getText();
		 System.out.println(i+" "+ coun_Name);
	 }
	
	

	}

}
