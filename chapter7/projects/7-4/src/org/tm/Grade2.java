package org.tm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Grade2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(new File("numbers.txt"));
		
		Integer gradeNum, classAvg, classTotal, classMin, classMax, count;
		gradeNum = classAvg = classMin = classMax = null;
		classTotal = count = 0;
		
		while (reader.hasNext()) {
			gradeNum = reader.nextInt();
			
			if (gradeNum == -1)
				break;
			
			count++;
			classTotal += gradeNum;
			
			if (classMin == null)
				classMin = gradeNum;
			else if (gradeNum < classMin)
				classMin = gradeNum;
			
			
			if (classMax == null)
				classMax = gradeNum;
			else if (gradeNum > classMax)
				classMax = gradeNum;
			
		}
		
		classAvg = classTotal / count;
		
		System.out.println("Highest grade: " + getLetterGrade(classMax) + " " + classMax);
		System.out.println("Lowest grade: " + getLetterGrade(classMin)  + " " + classMin);
		System.out.println("Class average " + getLetterGrade(classAvg) + " " + classAvg);
		
	}
	
	public static String getLetterGrade(int gradeNum) {
		if (gradeNum >= 96 && gradeNum <= 100)
			return "A+";
		else if (gradeNum >= 92 && gradeNum <= 95)
			return "A";
		else if (gradeNum >= 90 && gradeNum <= 91)
			return "A-";
		else if (gradeNum >= 86 && gradeNum <= 89)
			return "B+";
		else if (gradeNum >= 82 && gradeNum <= 85)
			return "B";
		else if (gradeNum >= 80 && gradeNum <= 81)
			return "B-";
		else if (gradeNum >= 76 && gradeNum <= 79)
			return "C+";
		else if (gradeNum >= 72 && gradeNum <= 75)
			return "C";
		else if (gradeNum >= 70 && gradeNum <= 71)
			return "C-";
		else if (gradeNum >= 66 && gradeNum <= 69)
			return "D+";
		else if (gradeNum >= 62 && gradeNum <= 65)
			return "D";
		else if (gradeNum >= 60 && gradeNum <= 61)
			return "D-";
		else
			return "F";
	}

}
