package com.Inheritancejava;

public class Fortunercar extends ToyotaCar {
 void Model()
{
	System.out.println("This car is 2019 model vehicle");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fortunercar f1 = new Fortunercar();
		
		f1.wheels();
		
		f1.maxSpeed();
		f1.Model();
	}

}
