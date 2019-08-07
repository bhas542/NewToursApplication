package com.ArraysJava;

public class DoubleDimenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
				String Array1[][]=new String[3][3];
				Array1[0][0]="LIVETECH";
				Array1[0][1]="HYDERABAD";
			Array1[0][2]="INDIA";
			Array1[1][0]="TESTING";
			Array1[1][1]="SRINI";
		Array1[1][2]="MADHU";
		Array1[2][0]="AMMERPET";
		Array1[2][1]="PTC";
	Array1[2][2]="SELENIUM";
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++) {
				
			System.out.print(Array1[i][j]+" ");
			
		}
			System.out.println();
			}
			

	}

}
