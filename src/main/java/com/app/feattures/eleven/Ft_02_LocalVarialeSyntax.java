package com.app.feattures.eleven;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ft_02_LocalVarialeSyntax {

	public static void localVariable() {
		List<String> list = Arrays.asList("a", "b", "c");
		String result = list.stream().map((var x) -> x.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(result);
	}

	public static void local() {
		List<String> sample = Arrays.asList("tech", "is", "beautiful");
		String output = sample.stream().map((var x) -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(output);
	}

	public static void main(String[] args) {
		//localVariable();
		local();
	}

}
