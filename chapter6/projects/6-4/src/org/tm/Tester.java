package org.tm;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);

		Dice die1 = new Dice();
		Dice die2 = new Dice();
		int dollars;
		int maxDollars = 0;
		int count = 0;
		int countAtMax = 0;
		
		System.out.print("How many dollars do you have? ");
        dollars = reader.nextInt();
		
        while (dollars > 0) {
        	count++;
        	int die1Value = die1.roll();
        	int die2Value = die2.roll();
        	
        	if (die1Value + die2Value == 7) 
        		dollars += 4;
        	else
        		dollars -= 1;
        	
        	if (dollars > maxDollars) {
        		maxDollars = dollars;
        		countAtMax = count;
        	}
        }
        
        System.out.println("You are broke after " + count + " rolls.");
        System.out.println("You should have quite after " + countAtMax + " rolls when you had $" + maxDollars + ".");
        
	}

}
