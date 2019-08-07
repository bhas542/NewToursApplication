package com.ComparisonMethods;

public class ComparisionStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="HYDERABAD";
String str2="HYDERABAD";
String str3="hyderabad ";
String  str4="hyd ";

if(str1.equals(str2))
{
	System.out.println("Both Strings are equal");
}
else
{
	System.out.println("These strings are not equal");
}
if(str2.equalsIgnoreCase(str3))
{
	System.out.println("Both Strings are equal");
	}
	else
	{
		System.out.println("These strings are not equal");
	}
if(str3.contains(str4))
{
	System.out.println("Both Strings are equal");
}
else
{
	System.out.println("Not contanins");
}
int strlen=str1.length();
System.out.println(strlen);
	}

}
