package com.GRIDSelenium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid_Selenium_Code {

 
@Parameters("Browser")
@Test
public void  logIn(String browser) throws MalformedURLException
{
	System.out.println("the browser name is : "+browser);
	DesiredCapabilities cap=null;
	if(browser.equalsIgnoreCase("Chrome")) {
		//cap=DesiredCapabilities.f
		cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		  
	}
	else
	{
		if(browser.equalsIgnoreCase("FireFox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
	}
		RemoteWebDriver driver= new RemoteWebDriver(new URL("http://192.168.242.1:4444/wd/hub"),cap);
           System.out.println("Welcome to FB Application Url");
		
		//System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		//driver= new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
	 
			driver.findElement(By.name("email")).sendKeys("bachi_542@gmail.com");
			/*
			 <input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
			 */
			       driver.findElement(By.name("pass")).sendKeys("516164161");
			       
			       driver.findElement(By.xpath("//input[@ value='Log In' and @aria-label='Log In']")).click();
}
}

		
			
			
			
	


