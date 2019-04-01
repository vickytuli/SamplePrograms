package com.ascena.programs;

public class Pattern1 {
	
	public static void main(String[] args) {
		int count = 9;
		int i,j;
		int rowcount = 1;
		for(i=count; i>0; i--) {
			for(j=1;j<=i;j++) {
				System.out.print(" ");
				}
			for(j=1;j<=rowcount;j++) {
				System.out.print(rowcount+" ");
				System.out.print(j+" ");
			}
			System.out.println();
			rowcount++;
		}
			
		}

}
