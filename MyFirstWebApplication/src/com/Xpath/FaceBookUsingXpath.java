package com.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookUsingXpath {

	public static void main(String[] args) {
		 WebDriver driver= null;
		 String Url="http://facebook.com";
		
		 System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		 driver.get(Url);
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bhas542@gmail.com");
		 driver.findElement(By.xpath("//input[@class='inputtext' and @data-testid='royal_pass']")).sendKeys("asjhffba");
		 driver.findElement(By.xpath("//*[@value='Log In' and @aria-label='Log In']")).click();

	}

}
