package com.OrangeHRMText;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
 
public class OrangeHRMHomePage {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=null;
		// System.setProperty("webdriver.gecko.driver","./Driver Files/geckodriver.exe");
		 System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
		List<WebElement>Links =driver.findElements(By.tagName("a"));
		int Linkscount=Links.size();
		System.out.println(Linkscount);
		for(int i=0;i<Linkscount;i++)
		{
			if(Links.isEmpty())
			{
				
				break;
			}
				String LinkName=Links.get(i).getText();
				System.out.println( LinkName);
		
			 
			 
		}
		/*
		 <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		 */
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(10000);
		driver.findElement(By.partialLinkText("Logout")).click();
		//driver.quit();
			
		
	//WebElement MyElement=driver.findElement(By.li
	//String Actual_Element=MyElement.getText();
	//System.out.println(Actual_Element);
		//String  Expected_Element="Welcome";
		//validation
		
	/* if(Actual_Element.contains(Expected_Element))
		{
			System.out.println("Passed: "+Actual_Element );
		}
		else {
			System.out.println("Failed: "+Expected_Element);
		}
		*/
		
		
		 

	}

}
