package com.AlertOperation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesOperations {

	public static void main(String[] args) {
		WebDriver driver=null;
		 System.setProperty("webdriver.chrome.driver", "./Driver Files/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://www.amazon.in");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Set<Cookie>Cookies=driver.manage().getCookies();
		 int cookiesCount=Cookies.size();
		 System.out.println(cookiesCount);
		 
		 for (Cookie var: Cookies)
		 {
			 System.out.println(Cookies);
		 
		 }
		driver.manage().deleteAllCookies();
		Cookies=driver.manage().getCookies();
		int CC=Cookies.size();
		System.out.println(CC);
	}

}
