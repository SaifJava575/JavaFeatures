package com.app.feattures.eleven;

import java.util.stream.Collectors;

public class Ft_01_NewStringMethods {

	// isBlank, lines, strip, stripLeading, stripTrailing, and repeat.

	public static void isBlank() {
		System.out.println(" ".isBlank()); // true
		String s = "Saifuddin";
		System.out.println(s.isBlank()); // false
		String s1 = "";
		System.out.println(s1.isBlank()); // true
	}

	public static void lines() {
		String str = "Saifuddin\nSujan\nI am good";
		System.out.println(str);
		System.out.println(str.lines().collect(Collectors.toList()));
	}

	public static void repeat() {
		String str = "saifuddin".repeat(4);
		System.out.println(str);
	}

	public static void strip() {
		String str = " Logicsoft ";
		System.out.print("Start");
		System.out.print(str.strip());
		System.out.println("End");

		System.out.print("Start");
		System.out.print(str.stripLeading());
		System.out.println("End");

		System.out.print("Start");
		System.out.print(str.stripTrailing());
		System.out.println("End");
	}

	public static void main(String[] args) {
		// isBlank();
		// lines();
		// repeat();
		strip();
	}

}
