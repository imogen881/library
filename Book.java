package com.qa;

public class Book extends Item implements Readable {
	private String genre;

	public Book(String title, String genre) {
		super(title);
		this.genre = genre;
	}

	@Override
	public int calcLendingDuration() {
		return 7;
	}

	@Override
	public String toString() {
		return "Book id = " + getId() + ", title = " + getTitle() + ", genre = " + getGenre();
	}

	public void read() {
		System.out.println("Reading " + this.getTitle());
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
