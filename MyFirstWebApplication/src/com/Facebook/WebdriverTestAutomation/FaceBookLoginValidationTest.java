package com.Facebook.WebdriverTestAutomation;


import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLoginValidationTest {

	public static void main(String[] args) {
		String url="http://Facebook.com";
		WebDriver driver= null;
		System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get(url);
		
		/*
		  <input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
		  id - Locator
		  email- selector
		 */
		//driver.findElement(By.id("email")).sendKeys("bachi_542@gmail.com");
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

}
