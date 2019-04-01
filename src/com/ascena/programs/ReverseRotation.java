package com.ascena.programs;

public class ReverseRotation {
	public static void main(String[] args) {

		int rotationArray[] = {1,2,3,4,5,6,8};
		int d = 2;
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		int arrayLength = rotationArray.length;
		int temp[] = new int[d];
		int removeLastDigits[] = new int[arrayLength-d];
		
		
		for (int i=arrayLength-1; i>=arrayLength-d; i--) {
			temp[count++] = rotationArray[i];
		}
		
		for (int i=0; i<arrayLength-d; i++) {
			removeLastDigits[i] = rotationArray[count1++];
		}
		
		for (int i=0; i <temp.length; i++) {
			rotationArray[i] = temp[i];
			
		}
		
		for(int i=d; i<arrayLength; i++) {
			rotationArray[i] = removeLastDigits[count2++];
		}
		
		
		
		
		for(int i=0; i<rotationArray.length;i++) {
			System.out.print(rotationArray[i]+",");
		}
		
		
		
		
		
		
	}
	
	
	

}
