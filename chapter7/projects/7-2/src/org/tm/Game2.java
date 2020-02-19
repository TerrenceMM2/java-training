package org.tm;

import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int guess = 0;
		
		System.out.print("Please choose a number between 1 and 100: ");
		int randomNumber = reader.nextInt();
		
		while (guess != randomNumber) {
			guess = (int) Math.round(Math.random() * 100);
			if (guess == randomNumber) {
				System.out.println("CORRECT! The computer guessed "+ guess + ".");
			} else {
				System.out.println("incorrect ... the computer guessed " + guess + ".");
			}
		}
	}
}
