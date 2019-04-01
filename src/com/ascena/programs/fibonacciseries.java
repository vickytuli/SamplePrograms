package com.ascena.programs;

public class fibonacciseries {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 1;
		int num3 ;
		int count = 1000;
		System.out.print("1 "+ "1 ");
		for(int i=3 ; i<=count; i++) {
			num3 = num1+ num2;
			System.out.print(" "+num3+ " ");
			num1= num2;
			num2 = num3;
			
		}
		
	}
		
}


