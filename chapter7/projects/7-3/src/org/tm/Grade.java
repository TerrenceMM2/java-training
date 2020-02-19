package org.tm;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Please number a numeric grade: ");
		int gradeNum = reader.nextInt();
		
		if (gradeNum >= 96 && gradeNum <= 100)
				System.out.println("Your letter grade is an A+.");
		else if (gradeNum >= 92 && gradeNum <= 95)
			System.out.println("Your letter grade is an A.");
		else if (gradeNum >= 90 && gradeNum <= 91)
			System.out.println("Your letter grade is an A-.");
		else if (gradeNum >= 86 && gradeNum <= 89)
			System.out.println("Your letter grade is a B+.");
		else if (gradeNum >= 82 && gradeNum <= 85)
			System.out.println("Your letter grade is a B.");
		else if (gradeNum >= 80 && gradeNum <= 81)
			System.out.println("Your letter grade is a B-.");
		else if (gradeNum >= 76 && gradeNum <= 79)
			System.out.println("Your letter grade is a C+.");
		else if (gradeNum >= 72 && gradeNum <= 75)
			System.out.println("Your letter grade is a C.");
		else if (gradeNum >= 70 && gradeNum <= 71)
			System.out.println("Your letter grade is a C-.");
		else if (gradeNum >= 66 && gradeNum <= 69)
			System.out.println("Your letter grade is a D+.");
		else if (gradeNum >= 62 && gradeNum <= 65)
			System.out.println("Your letter grade is a D.");
		else if (gradeNum >= 60 && gradeNum <= 61)
			System.out.println("Your letter grade is a D-.");
		else
			System.out.println("Your letter grade is an F.");
		
	}

}
