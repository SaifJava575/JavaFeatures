package com.app.feattures.eleven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class Ft_03_PredicateNotMethods {
	
	//static <T> Predicate<T> not​(Predicate<? super T> target) 

	@Test
	public void test_Predicate_Not() {
		String[] names = { "TEST", "MARY", " ", "" };
		List loweCaseList = Stream.of(names).filter(Predicate.not(String::isBlank)).collect(Collectors.toList());
		System.out.println(loweCaseList);
		assertEquals(2, loweCaseList.size());
	}
}
