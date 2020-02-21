package org.tm;

import java.util.Arrays;
import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Please enter a sentence: ");
		
		int count, avg, length;
		String sentence = reader.nextLine();
		
		if (sentence.equals(""))
			return;
		
		length = sentence.length();
		
		String[] words = sentence.split(" ");
		count = words.length;
		avg = 0;
		
		for (int i = 0; i < count; i++) {
			avg += words[i].length();
		}
		
		avg = avg / count;
		
		System.out.println(Arrays.toString(words));
		System.out.println("The sentence is " + length + " characters long.");
		System.out.println("There are " + count + " words in this sentence.");
		System.out.println("The average word length is " + avg + " characters.");
	}

}
