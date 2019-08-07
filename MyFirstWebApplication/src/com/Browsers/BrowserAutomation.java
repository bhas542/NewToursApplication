package com.Browsers;


	
import org.openqa.selenium.chrome.ChromeDriver;
	//import  org.openqa.selenium.firefox.*;
	import org.openqa.selenium.edge.*;

	
	public class BrowserAutomation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "G:\\Testing\\MyWebApplication\\MyFirstWebApplication\\Driver Files\\chromedriver.exe");
	ChromeDriver d = new ChromeDriver();
		//System.setProperty("Webdriver.gecko.driver", ".Driver Files/geckodriver.exe");
		//FirefoxDriver f= new FirefoxDriver();
		System .setProperty("webdriver.edge.driver","./Driver Files/MicrosoftWebDriver.exe");
		EdgeDriver e= new EdgeDriver();
		
	}

}
