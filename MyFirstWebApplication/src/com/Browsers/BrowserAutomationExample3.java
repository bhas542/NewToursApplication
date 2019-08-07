package com.Browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAutomationExample3 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./Driver Files/chromedriver.exe" );
				 ChromeDriver driver = new ChromeDriver();
				//String expected_Bing_Title="Bing";
				String expected_Bing_URL="facebook.com";
				 String url="http://facebookmmm.com";
				 driver.get(url);
				 
				 String Actual_Bing = driver.getCurrentUrl();
				 //validation
				 if(Actual_Bing.contains(expected_Bing_URL))
				 {
					 System.out.println("Expected is same as Acutal Result:  PASS "+expected_Bing_URL);
					 
				 }
				 else
				 {
					 System.out.println("Expected is not Matching with Actual: FAIL  "+ Actual_Bing);
				 }
				 //driver.close();
				 
				 

	}

}
