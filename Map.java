package com.qa;

public class Map extends Item {
	private int year;

	public Map(String title, int year) {
		super(title);
		this.year = year;
	}

	@Override
	public int calcLendingDuration() {
		return 20;
	}

	@Override
	public String toString() {
		return "Map id = " + getId() + ", title = " + getTitle() + ", year = " + getYear();
	}

	// Does not implement readable interface so map can be studied rather than read
	public void study() {
		System.out.println("Studying map of " + this.getTitle());
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
