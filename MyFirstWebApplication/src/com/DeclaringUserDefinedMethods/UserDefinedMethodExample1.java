package com.DeclaringUserDefinedMethods;

public class UserDefinedMethodExample1 {
	
    public void mymethod1()
    {
    	System.out.println("The User Defined mymethod1 executed successfully");
    	  
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		UserDefinedMethodExample1 M1 = new UserDefinedMethodExample1();
		M1.mymethod1();
		M1.mymethod2();
		M1.mymethod1();
		M1.mymethod1();
	}
	public void mymethod2()
	{
		System.out.println("The user defined mymethod2 executed succesfully");
	}
}
