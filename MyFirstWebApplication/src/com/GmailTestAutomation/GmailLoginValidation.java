package com.GmailTestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginValidation {

	public static void main(String[] args) {
 WebDriver driver= null;
 System.setProperty("webdriver.chrome.driver", "./Driver Files/chromedriver.exe");
 driver = new ChromeDriver();
 String url="http://google.com";
 driver.get(url);
 /*
  <a class="gb_e" data-pid="23" href="https://mail.google.com/mail/?tab=wm0&amp;ogbl">Gmail</a>
  */
 //driver.findElement(By.linkText("Gmail")).click();
 /*
 <a href="https://accounts.google.com/AccountChooser?service=mail&amp;continue=https://mail.google.com/mail/" class="h-c-header__nav-li-link " target="_blank" ga-on="click" ga-event-category="ab experiment" ga-event-action="sign in" ga-event-label="nav">
 Sign in
</a>
*/
 //driver.findElement(By.linkText("Sign in")).click();
 /*
  <input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="username" spellcheck="false" tabindex="0" aria-label="Email or phone" name="identifier" autocapitalize="none" id="identifierId" dir="ltr" 
  data-initial-dir="ltr" data-initial-value="">
  */
 
 /*
  <a class="gb_ae gb_3 gb_pb" id="gb_70" href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/" target="_top">Sign in</a>
  */
 driver.findElement(By.linkText("Sign in")).click();
 
 driver.findElement(By.id("identifierId")).sendKeys("Reddybhas999");
 /*
  <span class="RveJvd snByac">Next</span>
  */
 driver.findElement(By.className("Next")).click();
 
 /*
  <input type="password" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="current-password" spellcheck="false" tabindex="0" aria-label="Enter your password" 
  name="password" autocapitalize="off" dir="ltr" data-initial-dir="ltr" data-initial-value="">
  */
 driver.findElement(By.name("password")).sendKeys("Reddy$999");
 /*
  <span class="RveJvd snByac">Next</span>
  */
 driver.findElement(By.className("Next")).click();
 
 /*
  <div class="T-I J-J5-Ji T-I-KE L3" role="button" tabindex="0" jslog="20510; u014N:cOuCgd,Kr2w4b" 
  gh="cm" style="user-select: none;">Compose</div>
  */
 
 WebElement elementVar=driver.findElement(By.className("T-I J-J5-Ji T-I-KE L3"));
 
 String txtelement=elementVar.getText();
 System.out.println(txtelement);
 
 
		

	}

}
