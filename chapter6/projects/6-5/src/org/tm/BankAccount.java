package org.tm;

public class BankAccount {

	private String name = "";
	private int balance = 0;
	
	public BankAccount(String newName, int newBalance) {
		name = newName;
		balance = newBalance;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setBalance(int newBalance) {
		balance = newBalance;
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdrawl(int amount) {
		balance -= amount;
		return balance;
	}
	
	public String toString() {
		String str;
		str = name + ", you have $" + balance + " in your account.";
		return str;
	}
	
}
