package com.Browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAurtomationExample2 {
	
	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "./Driver Files/chromedriver.exe" );
	 ChromeDriver  driver = new ChromeDriver();
	 driver.get("http://youtube.com");
	 
	 driver.close();
		
	}

}
