package com.ascena.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextFileReader {
	// public static final String User_Directory = System.getProperty("User.dir");
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\DarthVader_Regression\\sampleprograms\\Sample.txt");
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);

		String line;
		int Counter = 0;

		while ((line = reader.readLine()) != null) {

			// \\s+ is the space delimiter in java
			String[] wordList = line.split("\\s");
			for (int i = 0; i < wordList.length; i++) {
				if (wordList[i].contains("and")) {
					Counter++;
				}
			}

		}
		System.out.println("The number of And's are :- " + Counter);
	}
}
