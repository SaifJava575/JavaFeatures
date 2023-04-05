package com.app.feattures.seventeen;

public class Ft_03_InstanceOfPatternMatching {

	public static void main(String[] args) {

		Object object = "text";
		if (object instanceof String) {
			String text = (String) object;
			System.out.println(text.charAt(1));
		}

		// After modifying the code in Java 17 features
		Object object1 = "text";
		if (object1 instanceof String text) {
			System.out.println(text.charAt(1));
		}
	}

}
