package com.ascena.programs;

public class ArrayShiftByValue {
	
	public static void main(String[] args) {
		
		int[] givenArray = {1,2,3,4,5,6,7,8,9};
		int lengtharray = givenArray.length;
		int d = 2;
		int temp[] = new int[d];
		int temp1[] = new int[givenArray.length-d];
		int count = 0;
		int counter = 0;
		int counter1 = 0;
		int counter2 =0;
		 for (int i=givenArray.length-1; i>=givenArray.length-d ; i--) {
			 temp[count++] = givenArray[i];
			 //System.out.print(temp[count]+",");
			// System.out.println("");
			 
		 }
		
		for (int i=0;i<givenArray.length-d;i++) {
			temp1[counter] = givenArray[i];
			counter++;
			
			System.out.print(givenArray[counter]+",");
			// System.out.println("");
			
		}
		
		for (int i=0; i<d;i++) {
			givenArray[i] = temp[counter1++];
			//System.out.print(givenArray[i]+",");
			// System.out.println("");
		}
		System.out.println(givenArray.length);
		
		for (int i=d; i<=givenArray.length; i++) {
			givenArray[i] = temp[counter2++];
			
		}
		
		for (int i=0; i<givenArray.length; i++) {
			System.out.print(givenArray[i]+",");
			
		}
	}
		
}
