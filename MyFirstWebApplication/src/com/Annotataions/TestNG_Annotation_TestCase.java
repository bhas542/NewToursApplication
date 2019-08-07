package com.Annotataions;

import org.testng.annotations.Test;

public class TestNG_Annotation_TestCase {
@Test(priority=1)	
public	void gmailApplicationLaunch()
{
	System.out.println("Welcome to Gmail Application Url");
}
@Test(enabled=false)
public void LoginFunctionality()
{
	System.out.println("Welcome to Gmail Login Functionality");
}
@Test(priority=3)
public void  ComposeMail()
{
	System.out.println("you are ready to send mail");
	
}
@Test(priority=2)
public void InboxFunctionality()
{
	System.out.println("you can view the mails in INBOX");
}
}
