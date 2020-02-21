package org.tm;

import java.util.Scanner;

public class Invest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Please enter the intrest rate: ");
		double intrestRate = reader.nextDouble();
		
		System.out.print("Please enter the start principal balance: ");
		double principal = reader.nextInt();
		
		System.out.print("Please enter the number of years the money should stay in fund: ");
		int years = reader.nextInt();
		
		System.out.printf("%-10s | %-10s%n", "YEAR", "BALANCE");
		System.out.println("--------------------");
		for (int i = 0; i < years; i++) {
			for (int j = 0; j < 4; j++) {
				principal = principal * (1 + intrestRate / 400);
				System.out.printf("%-10d | $%-10.2f%n", i + 1, principal);
			}
		};
	}

}
