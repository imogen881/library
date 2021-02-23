package com.qa;

import java.util.ArrayList;

public class Library {
	private ArrayList<Item> items = new ArrayList<Item>();
	private ArrayList<Person> members = new ArrayList<Person>();
	private int itemCount;
	private int memberCount;

	public void printItems() {
		for (Item i : items) {
			System.out.println(i);
		}
	}

	public void printMembers() {
		for (Person p : members) {
			System.out.println(p);
		}
	}

	// Checks if item is available and person is a member
	public void checkOutItem(Person person, Item item) {
		if (!item.isCheckedOut() && person.isMember()) {
			item.setCheckedOut(true);
			person.setNumItemsCheckedOut(person.getNumItemsCheckedOut() + 1);
			System.out.println("You have taken out " + item.getTitle() + ". Please return it within "
					+ item.calcLendingDuration() + " days");
		} else if (!person.isMember()) {
			System.out.println("Please register as a member of the library first");
		} else {
			System.out.println("Unfortunately " + item.getTitle() + " has already been taken out");
		}
	}

	public void checkInItem(Item item) {
		item.setCheckedOut(false);
	}

	public boolean addItem(Item item) {
		item.setId(++itemCount);
		return this.items.add(item);
	}

	public boolean removeItem(Item item) {
		return this.items.remove(item);
	}

	public boolean registerMember(Person person) {
		person.setId(++memberCount);
		person.setMember(true);
		return this.members.add(person);
	}

	public void updateMember(Person person, String name) {
		person.setName(name);
		System.out.println("Your name has been updated");
	}

	public void updateMember(Person person, boolean member) {
		person.setMember(false);
		System.out.println("Your membership has been paused");
	}

	public void deleteMember(Person person) {
		person.setMember(false);
		members.remove(person);
		System.out.println("You are no longer a library member");
	}

}
