package com.qa;

public class Journal extends Item implements Readable {
	private String discipline;

	public Journal(String name, String discipline) {
		super(name);
		this.discipline = discipline;
	}

	@Override
	public int calcLendingDuration() {
		return 10;
	}

	@Override
	public String toString() {
		return "Journal id = " + getId() + ", title = " + getTitle() + ", discipline = " + getDiscipline();
	}

	public void read() {
		System.out.println("Reading " + this.getTitle());
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

}
