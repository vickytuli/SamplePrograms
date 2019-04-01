package com.ascena.programs;

public class ArraySorting {
	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 1, 78, 65, 12, 23, 12 };
		int i, j, temp;

		int arraylength = data.length;

		for (i = 0; i <= arraylength - 1; i++) {
			for (j = i + 1; j <= arraylength - 1; j++) {
				if (data[i] > data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}

			}

		}
		for (i = 0; i <= arraylength - 1; i++) {
			System.out.print(data[i] +", ");
		}

	}

}
