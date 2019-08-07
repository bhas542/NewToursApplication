package com.AlertOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertOperation_TSRTCApplication {

	public static void main(String[] args) {
		 WebDriver driver=null;
		 System.setProperty("webdriver.chrome.driver", "./Driver Files/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://www.tsrtconline.in");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.id("searchBtn")).click();
		 Alert alt=driver.switchTo().alert();
		String  alertText=alt.getText();
       System.out.println(alertText);
       alt.accept();
       //alt.dismiss();
	   driver.quit();
	
	}

}
