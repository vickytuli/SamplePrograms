package com.ascena.programs;

public class putnumbertoarray {
	public static void main(String[] args) {
		int i = 1234567;
		int length = Integer.toString(i).length();
		int newarray[] = new int[length];
		int count = 0;
		int temp = i;
		
		while(temp>0) {
			newarray[length-1] = temp%10;
			temp = temp/10;
			length--;
			
		}
		
		for(int k=0; k<newarray.length; k++) {
		System.out.println(newarray[k]);
		}
		
		
		
	}

}
