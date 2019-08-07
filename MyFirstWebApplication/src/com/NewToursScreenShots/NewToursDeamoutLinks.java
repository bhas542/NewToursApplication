package com.NewToursScreenShots;
 
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class NewToursDeamoutLinks {

	public static void main(String[] args) throws IOException {
		NewToursDeamoutLinks SS = new NewToursDeamoutLinks();
		 WebDriver driver= null;
		 System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://www.newtours.demoaut.com/");
		 List<WebElement>Links=driver.findElements(By.tagName("a"));
		 int LinksCount=Links.size();
		 
		 driver.manage().window().maximize();
		 //SS.CaptureScreenShots(driver,"WinMax"); 
		 
		System.out.println(LinksCount);
		 
		for(int i=0;i<LinksCount;i++)
		{
			String LN=Links.get(i).getText();
			System.out.println(LN);
			Links.get(i).click();
			SS.CaptureScreenShots(driver, LN);
			driver.navigate().back();
			Links=driver.findElements(By.tagName("a"));
			
		}
		
		  
		 
		   
		 	 }
	
     public  void CaptureScreenShots(WebDriver driver,String LN) throws IOException {
    	 
    	 try {
			TakesScreenshot ts=((TakesScreenshot)driver);
			  File NT=ts.getScreenshotAs(OutputType.FILE);
			  FileHandler.copy(NT,new File("./ScreenShot/" + LN +".png"));
			  
		} catch (Exception e) {
		 
			System.out.println("Exception While taking the screen shot failed "+e.getMessage());
		}
    	 
     }
	
}
