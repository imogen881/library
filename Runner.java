package com.qa;

public class Runner {

	public static void main(String[] args) {
		Library library = new Library();
		Book book1 = new Book("Harry Potter", "Fantasy");
		Book book2 = new Book("Nineteen Eighty-Four", "Dystopian");
		Book book3 = new Book("Wuthering Heights", "Tragedy");
		Journal journal1 = new Journal("Genes", "Biology");
		Journal journal2 = new Journal("The Cold War", "History");
		Journal journal3 = new Journal("Sleep", "Psychology");
		Map map1 = new Map("London", 1998);
		Map map2 = new Map("Manchester", 2015);
		Map map3 = new Map("Birmingham", 2020);
		Person person1 = new Person("John Smith");
		Person person2 = new Person("Jane Jones");

		library.addItem(book1);
		library.addItem(book2);
		library.addItem(book3);
		library.addItem(journal1);
		library.addItem(journal2);
		library.addItem(journal3);
		library.addItem(map1);
		library.addItem(map2);
		library.addItem(map3);
		library.registerMember(person1);
		library.registerMember(person2);
		library.updateMember(person2, false);
		library.printMembers();
		book1.read();
		map1.study();
		library.checkOutItem(person1, book1);
		library.printItems();
		library.checkInItem(book1);

	}

}
