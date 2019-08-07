package com.IFrameExample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_DropToElement {

	public static void main(String[] args) {
		 WebDriver driver=null;
		 System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://jqueryui.com/droppable/");
		 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement  Dragabble=driver.findElement(By.id("draggable"));
		WebElement Dropable= driver.findElement(By.id("droppable"));
		String DT=Dropable.getText();
		System.out.println(DT);
		Actions act = new Actions(driver);
	    act.dragAndDrop(Dragabble, Dropable).perform();
	   String Res=Dropable.getText();
	   System.out.println(Res);
	    // driver.quit();
	    
		
		 

	}

}
