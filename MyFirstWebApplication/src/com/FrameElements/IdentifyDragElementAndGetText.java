package com.FrameElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyDragElementAndGetText {

	public static void main(String[] args) {
		 WebDriver driver= null;
		 System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		driver= new ChromeDriver();
		 driver.get("http://jqueryui.com/droppable/");
		 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement  Dragabble=driver.findElement(By.id("draggable"));
		String DT=Dragabble.getText();
		System.out.println(DT);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Resizable")).click();
		 

	}

}
