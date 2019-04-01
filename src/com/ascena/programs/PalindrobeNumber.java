package com.ascena.programs;

public class PalindrobeNumber {
	
	public static void main(String[] args) {
		int number =  1331;
		int temp  = number;
		int sum = 0;
		
		while (temp>0) {
			int r = temp%10;
			sum = (sum*10)+r;
			temp = temp/10;
			
		}
		if(sum == number) {
			System.out.println("The numbers are palindrome");
		}else {
			System.out.println("The numbers are not palindrome");
		}
	}

}
