package org.tm;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		double number = reader.nextDouble();
		
		System.out.print("Please enter the number of approximations: ");
		double approx = reader.nextDouble();
		
		double guess = 1;
		
		double sqRt = number;
		
		for (int i = 0; i < approx; i++) {
			guess = (guess + number / guess) / 2;
			guess++;
			System.out.println(sqRt);
		}
		
		System.out.println(sqRt);
		System.out.println("The square root of " + number + " is " + sqRt + ".");
	}

}
