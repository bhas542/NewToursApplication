package com.Annotataions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FaceBookLoginAnnotations {
	WebDriver driver=null;
	@BeforeTest
	public	void launchApplication()
	{
		System.out.println("Welcome to FB Application Url");
		
		System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void loginValidation()
	{
		driver.findElement(By.name("email")).sendKeys("bachi_542@gmail.com");
		/*
		 <input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		 */
		       driver.findElement(By.name("pass")).sendKeys("516164161");
		       /*
		        <input value="Log In" aria-label="Log In"
		         data-testid="royal_login_button" 
		        type="submit" id="u_0_2">
		        */
		       driver.findElement(By.xpath("//input[@ value='Log In' and @aria-label='Log In']")).click();
	}
	
	
	@AfterTest
	public void closeApplication()
	{
		driver.quit();
		System.out.println("Application closed");
	}




}


