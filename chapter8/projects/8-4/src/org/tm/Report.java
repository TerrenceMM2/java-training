package org.tm;

import java.util.Scanner;

public class Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
				
		System.out.print("What is the purchase price? ");
		double price = reader.nextDouble();
		double downPayment = price * 0.1;
		double intrestRate = 0.12;
		
		double monthlyPayment = 0.05 * (price - downPayment);
		double intrestOwed = 0.0;
		double principal = 0.0;
		double remaining = price;
		
		System.out.println("Down Payment: " + downPayment);
		System.out.println("Intrest Rate: " + intrestRate);
		System.out.println("Monthly Payment: " + monthlyPayment);
		
		int month = 0;

		System.out.format("%-25s%-25s%-25s%-25s%-25s%-25s%n", "MONTH", "TOTAL OWED", "INTEREST OWED", "PRINCIPAL OWED", "MIN PAYMENT", "REMAINING BALANCE");
	
		while (price > 0) {
			
			if (price < monthlyPayment) {
				monthlyPayment = price;
				intrestOwed = price * intrestRate / 12;
				principal = monthlyPayment - intrestOwed;
				remaining = price - monthlyPayment;
				month++;
				System.out.format("%-25d$%-24.2f$%-24.2f$%-24.2f$%-24.2f$%-24.2f%n", month, price, intrestOwed, principal, monthlyPayment, remaining);
				price -= monthlyPayment;
			} else {
				intrestOwed = price * intrestRate / 12;
				principal = monthlyPayment - intrestOwed;
				remaining = price - monthlyPayment;
				month++;
				System.out.format("%-25d$%-24.2f$%-24.2f$%-24.2f$%-24.2f$%-24.2f%n", month, price, intrestOwed, principal, monthlyPayment, remaining);
				price -= monthlyPayment;
			}
		}
	}

}
