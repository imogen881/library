package com.qa;

public abstract class Item {
	private int id;
	private String title;
	private boolean isCheckedOut;

	public Item(String title) {
		this.title = title;
	}

	public abstract int calcLendingDuration();

	@Override
	public String toString() {
		return "Item id =" + getId() + ", title =" + getTitle();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isCheckedOut() {
		return isCheckedOut;
	}

	public void setCheckedOut(boolean isCheckedOut) {
		this.isCheckedOut = isCheckedOut;
	}

}
