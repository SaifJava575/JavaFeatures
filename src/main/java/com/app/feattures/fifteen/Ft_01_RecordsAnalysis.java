package com.app.feattures.fifteen;

record Person(String name, int age) {
	public Person {
		if (age < 0)
			throw new IllegalArgumentException("Age cannot be negative");
		if (name.length() < 5 || name.length() > 20)
			throw new IllegalArgumentException("Name should be between 5 to 20 characters");
	}
}

public class Ft_01_RecordsAnalysis {

	public static void main(String[] args) {
		Person person = new Person("saifuddin", 20);
		System.out.println(person);
	}

}
