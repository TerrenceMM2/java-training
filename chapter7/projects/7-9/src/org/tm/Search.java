package org.tm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.print("What file are you searching? ");
		String filename = reader.nextLine();
		File file = new File(filename);
		Scanner scannedFile = new Scanner(file);
		
		System.out.print("What word are you searching for? ");
		String searchTerm = reader.nextLine();
		searchTerm = searchTerm.toLowerCase();

		int lineNumber = 1;
		int wordCount = 0;
		int firstInst = 0;
		int hitCount = 0;
		
		while (scannedFile.hasNextLine()) {
			String line = scannedFile.nextLine();
			String[] words = line.split("\\W+");
			for (int i = 0; i < words.length; i++) {
				String word = words[i].toLowerCase();
				if (word.equals(searchTerm)) {
					if (hitCount == 0)
						firstInst = wordCount + i + 1;
					hitCount++;
				}
			}
			wordCount += words.length;
			lineNumber++;
		}
		
		if (hitCount == 0)
			System.out.println("Term not found.");
		else
			System.out.println("Term found " + hitCount + " times.");
			System.out.println("The first instance of the word " + searchTerm + " was found on word position " + firstInst + ".");
		
	}

}
