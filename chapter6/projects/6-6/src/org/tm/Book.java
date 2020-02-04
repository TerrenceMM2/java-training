package org.tm;

public class Book {
	
	private String bookTitle;
	private String bookAuthor;
	
	public Book() {
		bookTitle = null;
		bookAuthor = null;
	}
	
	public Book(String newTitle, String newAuthor) {
		bookTitle = newTitle;
		bookAuthor = newAuthor;
	}
	
	public String getTitle() {
		return bookTitle;
	}
	
	public String getAuthor() {
		return bookAuthor;
	}
	
	public String toString() {
		String str;
		str = bookTitle + " by " + bookAuthor;
		return str;
	}

}
