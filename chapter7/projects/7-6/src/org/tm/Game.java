package org.tm;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		Random generator = new Random();
		
		int die1, die2, dollars, count, avg;
		
		avg = count = 0;
		
		for (int i = 0; i < 100; i++) {
			dollars = 100;
			while (dollars > 0) {
				count++;
				
				die1 = generator.nextInt(6) + 1;
				die2 = generator.nextInt(6) + 1;
				
				if (die1 + die2 == 7)
					dollars += 4;
				else
					dollars -= 1;
			}
		}
				
		avg = count / 100;
		
		System.out.println
		("You are broke after an average of " + avg + " rolls.");

	}

}
