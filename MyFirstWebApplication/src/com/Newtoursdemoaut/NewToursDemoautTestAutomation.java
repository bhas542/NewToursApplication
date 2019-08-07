package com.Newtoursdemoaut;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class NewToursDemoautTestAutomation {

	public static void main(String[] args) {
	  
		WebDriver driver=null;
		
	System.setProperty("webdriver.gecko.driver","./Driver Files/geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://newtours.demoaut.com");
	/*
	 <a href="mercurysignon.php">SIGN-ON</a>
	 */
	//driver.findElement(By.linkText("SIGN-ON")).click();
	
	/*
	 <input name="userName" size="20" maxlength="60">
	 */
	driver.findElement(By.name("userName")).sendKeys("tutorial");
	/*
	 <input name="password" type="password" size="20" maxlength="60">
	 */
	driver.findElement(By.name("password")).sendKeys("tutorial");
	
	/*
	 <input name="login" width="60" height="23" type="image" alt="Login"
	  src="/images/forms/submit.gif" border="0" value="Login">
	 */
	driver.findElement(By.name("login")).click();
	
	 String Expected_Title="Find";
	//Validation
	
//String Actual_Title=driver.getTitle();
//System.out.println(Actual_Title);

if(driver.getTitle().contains(Expected_Title))
{
	System.out.println("Login Successful - PASS  "+ driver.getTitle() );
	
}
else
{
	System.out.println("Login Failed- FAIL "+ Expected_Title);
}

	}

}
