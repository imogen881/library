package com.qa;

public class Person {
	private int id;
	private String name;
	private int numItemsCheckedOut;
	private boolean isMember;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person id = " + getId() + ", name = " + getName();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumItemsCheckedOut() {
		return numItemsCheckedOut;
	}

	public void setNumItemsCheckedOut(int numItemsCheckedOut) {
		this.numItemsCheckedOut = numItemsCheckedOut;
	}

	public boolean isMember() {
		return isMember;
	}

	public void setMember(boolean isMember) {
		this.isMember = isMember;
	}

}
