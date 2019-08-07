package com.LinkValidationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkComparisionTesting {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=null;
		 System.setProperty("webdriver.gecko.driver","./Driver Files/geckodriver.exe");
		 driver = new FirefoxDriver();
		 String url ="http://newtours.demoaut.com";
		 driver.get(url);
		//String Expected_url= "mercuryregister.php";
		Thread.sleep(10000);
	   String refurl=driver.findElement(By.linkText("SUPPORT")).getAttribute("href");
	   System.out.println(refurl);
	   driver.findElement(By.linkText("SUPPORT")).click();
	  String ActualUrl =driver.getCurrentUrl();
	  System.out.println(ActualUrl);
	  //validation
	  if(ActualUrl.equals(refurl))
	  {
		  System.out.println("The Actual and Expected Result are same -PASS  "+ActualUrl  );
		  System.out.println("The Actual and Expected Result are same -PASS  "+ refurl);
		  
	  }
	  else
	  {
		  System.out.println("The Actual url is not matching with Expected url - FAIL " +ActualUrl );
		  System.out.println("The Actual url is not matching with Expected url - FAIL "+ refurl);
		  
	  }
	}

}
