package com.Annotataions;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodandAfterMethod {
	@BeforeMethod
	public	void amazonUrl()
	{
		System.out.println("Welcome to Amazon  Url");
	}
	@Test(priority=1)
	public void loginFunctionality()
	{
		System.out.println("Please Login into Amazon");
	}
	@Test(priority=2)
	public void  selectProduct()
	{
		System.out.println("you are ready to add to cart");
		
	}
	@Test(enabled=false)
	public void listView()
	{
		System.out.println("You can view your List");
	}
	@Test(priority=3)
	public void contactInfo()
	{
		System.out.println("Please enter contact details");
	}
	@AfterMethod
	public void amazonClose()
	{
		System.out.println("Please Close the amzon site");
	}
}
