package com.Annotataions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_BeforeAndAfter_Test {
	@BeforeTest
	public	void gmailApplicationLaunch()
	{
		System.out.println("Welcome to Gmail Application Url");
	}
	@Test(priority=2)
	public void LoginFunctionality()
	{
		System.out.println("Welcome to Gmail Login Functionality");
	}
	@Test(priority=1)
	public void  ComposeMail()
	{
		System.out.println("you are ready to send mail");
		
	}
	@Test(enabled=false)
	public void InboxFunctionality()
	{
		System.out.println("you can view the mails in INBOX");
	}
	@Test(priority=3)
	public void sentMail()
	{
		System.out.println("you can view the mails in INBOX");
	}
	@AfterTest
	public void gmailClose()
	{
		System.out.println("Gmail Application closed");
	}
}
