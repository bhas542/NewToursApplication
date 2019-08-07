package com.keyboardoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendDataUsing_KeyboardKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://facebook.com");
		 driver.findElement(By.id("email")).sendKeys("bhas542@gmail.com");
		 Actions act = new Actions(driver);
		 act.sendKeys(Keys.TAB).perform();
		 act.sendKeys("hello").perform();
		 act.sendKeys(Keys.ENTER).perform();
		 
		

	}

}
