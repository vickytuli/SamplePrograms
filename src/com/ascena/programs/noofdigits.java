package com.ascena.programs;

public class noofdigits {

	public static void main(String[] args) {
		int number = 121;
		int n = order(number);
		int temp = number;
		int sum = 0;
		while (temp !=0) {
			int r = temp%10;
			int calculate = power(r, n);
			temp = temp/10;
			sum = sum +calculate;
		}
				
		if (sum == number) {
			System.out.println("The nos are armstrong");
		}
		else {
			System.out.println("The nos are not armstrong");
		}
	}

	public static int order(int number) {
		int x = 0;
		while (number != 0) {
			x++;
			number = number / 10;
		}
		return x;

	}
	
	public static int power(int x, long y) {
		if(y == 0) {
			return 1;
		}
		else if(y%2 == 0){
			return power(x, y/2)*power(x, y/2);
		}
		else {
			return x*power(x, y/2)*power(x, y/2);
		}
		
	}

}
