package com.app.feattures.eight;

@FunctionalInterface
interface AddInterface {
	void add(int a, int b);

	// It can contain any number of Object class methods.
	int hashCode();

	String toString();

	boolean equals(Object obj);
}

public class Ft_04_FunctionalInterface implements AddInterface {

	public static void main(String[] args) {
		Ft_04_FunctionalInterface fun = new Ft_04_FunctionalInterface();
		fun.add(10, 20);
	}

	@Override
	public void add(int a, int b) {
		System.out.println(a + b);

	}

}
