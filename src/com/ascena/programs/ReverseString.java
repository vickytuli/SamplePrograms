package com.ascena.programs;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name that u want to Reverse :- ");
		String Name = in.nextLine();
		char[] CharName = Name.toCharArray();

		for (int i = CharName.length - 1; i >= 0; i--) {
			System.out.print(CharName[i]);
		}

	}
}
