package com.ascena.programs;

import java.util.Random;

public class OneTimePassword {

	public static void main(String[] args) {
		System.out.println("The OTP is "+ generateOTP(7));

	}

	public static String generateOTP(int length) {

		//char[] password = new char[length];
		StringBuilder salt = new StringBuilder();
		String ALPHABETS_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Alphabets_LowerCase = "abcdefghijklmnopqrstuvwxyz";
		String digits = "0123456789";

		String Values = ALPHABETS_CAPS + Alphabets_LowerCase + digits;
		 Random random = new Random();
		 while (salt.length() < length) { // length of the random string.
	            int index = (int) (random.nextFloat() * Values.length());
	            salt.append(Values.charAt(index));
	        }
		 String saltStr = salt.toString();
		 return saltStr;
	}

}
