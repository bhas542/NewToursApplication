package com.ArraysJava;

public class ExceptionHanlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		int z;
		try {
			z=a/b; 
			System.out.println(z);
			}
		catch(Exception K)
		{
			System.out.println("This is error"+ K );
		}

	}

}
