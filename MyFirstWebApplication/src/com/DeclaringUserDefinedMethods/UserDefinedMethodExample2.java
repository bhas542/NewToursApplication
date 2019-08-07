package com.DeclaringUserDefinedMethods;

public class UserDefinedMethodExample2 {
 //these are the global variables it can access through out the class
	int a=10;
 int  b=20;
 int c;
	public void addition()
	{
		c=a+b;
		System.out.println("The addtion of a and b is :"+ c);
	
}
	public void Subtraction()
	{
		c=b-a;
		System.out.println("The sub of a and b is :"+ c);
	
}
	public void multiplication()
	{
		c=a*b;
		System.out.println("The mul of a and b is :"+ c);
	
}
	private void div()
	{
		int a=15;
		int b= 3;
		int c;
		c=a/b;
		System.out.println("The div of a and b is :"+ c);
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDefinedMethodExample2 o1 = new UserDefinedMethodExample2();
		o1.addition();
		o1.Subtraction();
		UserDefinedMethodExample2 o2 = new UserDefinedMethodExample2();
o2.multiplication();
	 o2.div();
	
	}

}
