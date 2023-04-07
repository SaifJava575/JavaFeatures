package com.app.feattures.nine;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ft_05_StreamApiImprovements {

	// default Stream<T> takeWhile(Predicate<? super T> predicate)
	public static void takewhile() {
		Stream.of("a", "b", "c", "", "e", "f").takeWhile(s -> !s.isEmpty()).forEach(System.out::print);
	}

	// default Stream<T> dropWhile(Predicate<? super T> predicate)
	public static void dropWhile() {
		Stream.of("a", "b", "c", "", "e", "f").dropWhile(s -> !s.isEmpty()).forEach(System.out::print);

		System.out.println();
		Stream.of("a", "b", "c", "", "e", "", "f").dropWhile(s -> !s.isEmpty()).forEach(System.out::print);
	}

	// static <T> Stream<T> iterate(T seed, Predicate<? super T> hasNext,
	// UnaryOperator<T> next)
	public static void iterate() {
		IntStream.iterate(3, x -> x < 10, x -> x + 3).forEach(System.out::println);
	}

	// static <T> Stream<T> ofNullable(T t)
	public static void nullable() {
		long count = Stream.ofNullable(100).count();
		System.out.println(count);

		count = Stream.ofNullable(null).count();
		System.out.println(count);
	}

	public static void main(String[] args) {
		// takewhile();
		// dropWhile();
		//iterate();
		nullable();
	}

}
