package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_ByusingXpath {

	public static void main(String[] args) {
		WebDriver driver= null;
		System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("Destinations")).click();
		WebElement backToHome=driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']"));
		 backToHome.click();

	}

}
