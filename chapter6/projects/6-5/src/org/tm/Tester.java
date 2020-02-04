package org.tm;

public class Tester {

	public static void main(String[] args) {

		BankAccount terrence = new BankAccount("Terrence", 1000);
		
		terrence.deposit(100);
		
		System.out.println(terrence);
		
		terrence.withdrawl(250);
		
		System.out.println(terrence);
		
		terrence.setName("Terrence Mahnken");
		
		System.out.println(terrence);
		
		terrence.setBalance(2000);
		
		System.out.println(terrence);
	}

}
