package com.ascena.programs;

public class RemoveWhiteSpacesInString {
	public static void main(String[] args) {
		String withWhiteSpaces = "Java is cool";
		
		String withoutWhiteSpaces = withWhiteSpaces.replaceAll("\\s", "");
		
		System.out.println(withoutWhiteSpaces);
	}
	
	
	

}
