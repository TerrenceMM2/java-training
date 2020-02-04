package org.tm;

public class Patron {
	
	private String patronName;
	private Book book1;
	private Book book2;
	private Book book3;

	public Patron(String newName) {
		patronName = newName;
	}
	
	public Boolean checkedBook(String bookTitle) {
		if (book1.getTitle().equals(bookTitle)) {
			return true;
		} else if (book2.getTitle().equals(bookTitle)) {
			return true;
		} else if (book3.getTitle().equals(bookTitle)) {
			return true;
		} else {
			return false;
		}			
	}
	
	public Boolean borrowBook(String bookTitle, String bookAuthor) {
		if (book1 == null) {
			book1 = new Book(bookTitle, bookAuthor);
			return true;
		} else if (book2 == null) {
			book2 = new Book(bookTitle, bookAuthor);
			return true;
		} else if (book3 == null) {
			book3 = new Book(bookTitle, bookAuthor);
			return true;
		} else {
			return false;
		}
	}
	
	public Boolean returnBook(String bookTitle) {
		if (book1.getTitle().equals(bookTitle)) {
			book1 = null;
			return true;
		} else if (book2.getTitle().equals(bookTitle)) {
			book2 = null;
			return true;
		} else if (book3.getTitle().equals(bookTitle)) {
			book3 = null;
			return true;
		} else {
			return false;
		}			
	}
	
	public String toString() {
		String str;
		str = patronName + " has checked out the following books: \n" + book1 + "\n"+ book2 + "\n" + book3;
		return str;
	}
	
}
