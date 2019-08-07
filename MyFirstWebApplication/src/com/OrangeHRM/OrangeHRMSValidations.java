package com.OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class OrangeHRMSValidations {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		String url="https://opensource-demo.orangehrmlive.com/";
		System.setProperty("webdriver.chrome.driver", "./Driver Files/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement Mouse=driver.findElement(By.linkText("PIM"));
		Actions act= new Actions(driver);
		act.moveToElement(Mouse).perform();
		 
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement ad=driver.findElement(By.id("menu_pim_addEmployee"));
		ad.click();
		driver.findElement(By.id("firstName")).sendKeys("Trump");
		driver.findElement(By.id("middleName")).sendKeys("John");
		driver.findElement(By.id("lastName")).sendKeys("Donald");
		//driver.findElement(By.id("employeeId")).sendKeys("99999");
		WebElement findelement=driver.findElement(By.id("employeeId"));
		String B=findelement.getAttribute("value");
		System.out.println(B);
	   driver.findElement(By.id("btnSave")).click();
	   driver.findElement(By.linkText("Personal Details")).click();
	   WebElement D1=driver.findElement(By.tagName("h1"));
	   String D2=D1.getText();
	   System.out.println(D2);
	   WebElement reqid=driver.findElement(By.id("personal_txtEmployeeId"));
	   String emp_id=reqid.getAttribute("value");
	   System.out.println(emp_id);
	   //driver.findElement(By.linkText("Employee List")).click();
	   
	   if(B.equals(emp_id))
	   {
		   System.out.println(B+ "The employee id generated successful: "+emp_id);
	   }
	   else
	   {
		   System.out.println(B+" The employee not matching: "+ emp_id);
	   }
	   driver.findElement(By.linkText("Welcome Admin")).click();
	   Thread.sleep(10000);
	   driver.findElement(By.linkText("Logout")).click();
	   
	   /*
	   if(D2.equalsIgnoreCase("Trump John Donald"))
	   {
		   System.out.println("Login successful PASS");
	   }
	   else
	   {
	   System.out.println("Login FAIL");
   }
	   */
	   
	
	}

}
