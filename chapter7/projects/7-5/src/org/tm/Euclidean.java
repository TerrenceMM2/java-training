package org.tm;

import java.util.Scanner;

public class Euclidean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int remainder, small, large;
		remainder = small = large = 0;
		
		System.out.print("Interger A: ");
		int numA = reader.nextInt();
		
		System.out.print("Interger B: ");
		int numB = reader.nextInt();
		
		if (numA > numB) {
			small = numB;
			large = numA;
		} else {
			small = numA;
			large = numB;
		}
		
		while (small != 0) {
			remainder = large % small;
			large = small;
			small = remainder;
		}
		
		System.out.println("The Greatest Common Divisor is " + large);
	}

}
