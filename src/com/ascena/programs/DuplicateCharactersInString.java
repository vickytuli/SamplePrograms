package com.ascena.programs;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharactersInString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		String name = in.nextLine();
		HashMap<Character, Integer> charcountMap = new HashMap<Character, Integer>();
		char[] ch = name.toCharArray();
		for (char c : ch ) {
			if(charcountMap.containsKey(c)) {
				charcountMap.put(c, charcountMap.get(c)+1);
			}
			else {
				charcountMap.put(c, 1);
			}
		}
		
		 /*Set<Character> charsInString = charcountMap.keySet();
		 
		 for(Character c : charsInString) {
			 if(charcountMap.get(c)>0) {
				 System.out.println(c + " : "+ charcountMap.get(c));
			 }
			 
		 }*/
		 System.out.println(charcountMap);
	}
	
}
