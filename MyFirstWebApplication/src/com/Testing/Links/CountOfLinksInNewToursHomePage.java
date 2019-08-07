package com.Testing.Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountOfLinksInNewToursHomePage {

	public static void main(String[] args) {
		 WebDriver driver=null;
		String  url="http://newtours.demoaut.com";
		System.setProperty("webdriver.gecko.driver", "./Driver Files/geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get(url);
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		int Linkscount=Links.size();
		for (int k=0;k<Linkscount;k++)
		{
		  String LinkNames=Links.get(k).getText();
			
			System.out.println("the Link names are: "+LinkNames);
		}
		System.out.println(Linkscount);
		driver.quit();
		
		
		

	}

}
