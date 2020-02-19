package org.tm;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		int guess = 0;
		
		int randomNumber = (int) Math.round(Math.random() * 100);
		System.out.println(randomNumber);
		
		System.out.println("The computer has chosen a number between 0 and 100");
		
		while (guess != randomNumber) {
			System.out.print("Choose a number between 0 and 100: ");
			guess = reader.nextInt();
			if (guess == randomNumber) {
				System.out.println("CORRECT! The computer chose "+ randomNumber + ".");
				break;
			} else {
				System.out.println("incorrect ...");
			}
		}
		
	}

}
