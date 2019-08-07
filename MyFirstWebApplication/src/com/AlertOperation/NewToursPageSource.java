package com.AlertOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewToursPageSource {

	public static void main(String[] args) {
		WebDriver driver=null;
		 System.setProperty("webdriver.chrome.driver", "./Driver Files/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://www.newtours.demoaut.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 String PageSource=driver.getPageSource();
        if(PageSource.contains("REGISTER"))
        {
        	System.out.println("Element Found ");
        }
        else
        {
        	System.out.println("Element Not Found");
        }
	}

}
