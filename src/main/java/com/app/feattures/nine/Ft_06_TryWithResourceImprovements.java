package com.app.feattures.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Ft_06_TryWithResourceImprovements {

	// Java 7 Features
	public static String readData(String message) throws IOException {
		Reader inputString = new StringReader(message);
		BufferedReader br = new BufferedReader(inputString);
		try (BufferedReader br1 = br) {
			return br1.readLine();
		}
	}

	// java 9 Features
	static String readData1(String message) throws IOException {
		Reader inputString = new StringReader(message);
		BufferedReader br = new BufferedReader(inputString);
		try (br) {
			return br.readLine();
		}
	}

	public static void main(String[] args) throws IOException {
		System.out.println(readData1("test"));
	}

}
