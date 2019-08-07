package com.DeclaringUserDefinedMethods;

public class UserDefinedMethodExample3 {
	//Declared Global Variables
	int Employee_ID;
	String Employee_Name;
	public void insert_Data(int empid, String empname)
	{
		Employee_ID = empid;
		Employee_Name=empname;
		System.out.println("the employee id and employee name " +  Employee_ID  +  Employee_Name);
	}
	void displayinformation()
	{
		System.out.println(" Display this info");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDefinedMethodExample3 m1 =new  UserDefinedMethodExample3();
		m1.insert_Data(10, "Jaggu");
		m1.insert_Data(20, "Hari");
		UserDefinedMethodExample3 m2 =new  UserDefinedMethodExample3();
		m2.displayinformation();
		
		
	}

}
