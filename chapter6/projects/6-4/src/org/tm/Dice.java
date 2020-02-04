package org.tm;

public class Dice {
	
	private int show;
	
	public Dice() {
		show = 0;
	}
	
	public int getNum() {
		return show;
	}
	
	public int roll() {
		show = (int)(Math.random() * 6 + 1);
		return show;
	}
	
	public String toString() {
		String str;
		str = "You rolled a " + show;
		return str;
	}
}
