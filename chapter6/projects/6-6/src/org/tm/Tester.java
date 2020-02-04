package org.tm;

public class Tester {

	public static void main(String[] args) {
		
		Patron terrence = new Patron("Terrence");
		
		terrence.borrowBook("The Phoenix Project", "Gene Kim");
		terrence.borrowBook("The Martian", "Andy Weir");
		terrence.borrowBook("John Dies at the End", "David Wong");
		terrence.borrowBook("The Once and Future King", "T.H. White");
		
//		terrence.returnBook("The Martian");
		
		System.out.println(terrence.checkedBook("Harry Potter"));
		
		System.out.println(terrence);

	}

}
