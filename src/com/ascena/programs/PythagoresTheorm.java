package com.ascena.programs;

public class PythagoresTheorm {

	public static void pythagoresLogic( int a[]) {
		//int[] array_no = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		//int a[]=new int[3];
		int sizearray_noray = a.length;
		for (int i=0; i<sizearray_noray; i++) 
        { 
            for (int j=i+1; j<sizearray_noray; j++) 
            {     
                for (int k=j+1; k<sizearray_noray; k++) 
                { 
                    // Calculate squarray_noe of array_noray elements 
                    int x = a[i]*a[i], y = a[j]*a[j], z = a[k]*a[k]; 
   
                    if (x == y + z || y == x + z || z == x + y) {
                        System.out.print("["+a[i]+ ",");
                    System.out.print(a[j]+ ",");
                    System.out.print( a[k] +"]");
                    System.out.println("");
                    }
                   
                } 
            } 
        } 

	}
	
	public static void main(String[] args) {
		int[] array_no = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int[] array_no_1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,33,33,3344,533,43232};
		pythagoresLogic(array_no);
		pythagoresLogic(array_no_1);
	}

}
