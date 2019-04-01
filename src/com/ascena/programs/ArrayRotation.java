package com.ascena.programs;

public class ArrayRotation {
	public static void main(String[] args) {

		int givenarray[] = { 1, 2, 3, 4, 0, 7, 5, 0, 0, 0, 1, 2, 3, 4 };

		int lengthofarray = givenarray.length;

		int count = 0;

		for (int i = 0; i < lengthofarray; i++) {
			if (givenarray[i] != 0) {
				// System.out.println(count++);
				givenarray[count++] = givenarray[i];
			}
		}

		while (count < lengthofarray) {
			givenarray[count++] = 0;
		}
		for (int i = 0; i < lengthofarray; i++) {
			System.out.print(givenarray[i]);
			// System.out.println(count);
		}

	}
}
