package com.ascena.programs;

import java.util.Scanner;

public class ReverseASentence {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Sentence :-");
		String Sentence  = in.nextLine();
		String[] Split = Sentence.split("\\s");
		int noofwords = Split.length;
		for (int i=noofwords-1 ; i>=0;i--) {
			System.out.print(Split[i] + " ");
		}
		
	}
	

}
