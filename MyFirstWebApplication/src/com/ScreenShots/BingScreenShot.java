package com.ScreenShots;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BingScreenShot {

	public static void main(String[] args) throws IOException {
		 WebDriver driver= null;
		 System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://Bing.com");
		 //Maximize the Window
		 driver.manage().window().maximize();
		 //Implicit Wait
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //Takes ScreenShot-it is an interface in selenium webdriver
		 //output Type - it is an interface in selenium webdriver
		 //type casting
		 File  Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  FileHandler.copy(Screenshot,new File("./ScreenShot/bing.png"));
		  
		  
		 
		 
		 
		 
		 

	}

}
