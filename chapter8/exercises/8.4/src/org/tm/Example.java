package org.tm;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		Thermometer thermo = new Thermometer();
		String doItAgain = "y";
		
		while (doItAgain.equals("y") || doItAgain.equals("Y")) {
			
			while (true)
				try {
					System.out.print("\nEnter degrees Fahrenheit: ");
					thermo.setFahrenheit(reader.nextDouble());
					break;
				} catch(Exception e) {
					System.out.println("Error in number format!");
					reader.nextLine();
				}

			System.out.println("The equivalent in Celsius is " + thermo.getCelsius());
			System.out.print("\nDo it again (y/n)? ");
			reader.nextLine();
			doItAgain = reader.nextLine();
		}
	}

}
