package com.app.feattures.nine;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ft_07_OptionalClassImprovents {

	// public Stream<T> stream()
	public static void stream() {
		List<Optional<String>> list = Arrays.asList(Optional.empty(), Optional.of("A"), Optional.empty(),
				Optional.of("B"));

		// filter the list based to print non-empty values

		// if optional is non-empty, get the value in stream, otherwise return empty
		List<String> filteredList = list.stream().flatMap(o -> o.isPresent() ? Stream.of(o.get()) : Stream.empty())
				.collect(Collectors.toList());

		// Optional::stream method will return a stream of either one
		// or zero element if data is present or not.
		List<String> filteredListJava9 = list.stream().flatMap(Optional::stream).collect(Collectors.toList());

		System.out.println(filteredList);
		System.out.println(filteredListJava9);
	}

	// public void ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction)
	public static void presentOrElse() {
		Optional<Integer> optional = Optional.of(1);

		optional.ifPresentOrElse(x -> System.out.println("Value: " + x), () -> System.out.println("Not Present."));

		optional = Optional.empty();

		optional.ifPresentOrElse(x -> System.out.println("Value: " + x), () -> System.out.println("Not Present."));
	}

	// public Optional<T> or(Supplier<? extends Optional<? extends T>> supplier)
	public static void or() {
		Optional<String> optional1 = Optional.of("Mahesh");

		Supplier<Optional<String>> supplierString = () -> Optional.of("Not Present");

		optional1 = optional1.or(supplierString);

		optional1.ifPresent(x -> System.out.println("Value: " + x));

		optional1 = Optional.empty();

		optional1 = optional1.or(supplierString);

		optional1.ifPresent(x -> System.out.println("Value: " + x));
	}

	public static void main(String[] args) {
		// stream();
		//presentOrElse();
		or();
	}

}
