package com.HeaderBlockElements;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindHeaderBlockElemetsOf_TSRTC {

	public static void main(String[] args) {
		 WebDriver driver=null;
		 System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://www.tsrtconline.in");
		 driver.manage().window().maximize();
		WebElement HeaderBlock=driver.findElement(By.className("menu-wrap"));
		 List<WebElement>MenuElements=HeaderBlock.findElements(By.tagName("a"));
		 int MenuElecount=MenuElements.size();
		 System.out.println(MenuElecount);
		 for(int i=0; i<MenuElecount;i++) {
		 String	LinkName= MenuElements.get(i).getText(); 
		 System.out.println(LinkName);
		 }
		  

	}

}
