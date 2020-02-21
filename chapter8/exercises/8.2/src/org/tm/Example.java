package org.tm;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		Thermometer thermo = new Thermometer();
		String doItAgain = "y";
		
		while (doItAgain.equals("y") || doItAgain.equals("Y")) {
			System.out.print("\nEnter degrees Fahrenheit: ");
			thermo.setFahrenheit(reader.nextDouble());
			
			reader.nextLine();
			System.out.println("The equivalent in Celsius is " + thermo.getCelsius());
			System.out.print("\nDo it again (y/n)? ");
			doItAgain = reader.nextLine();
		}
	}

}
