package com.java8.practice.paractice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleJava8 {

	public static void main(String[] args) {
		// Shorted and This is clean, readable, and commonly used
		// Stream<Integer> s1 = Stream.of(10,20,30,56,45,67);
		// s1.forEach(x -> System.out.println(x));

		Stream<Integer> s11 = Stream.of(new Integer[] { 10, 20, 30, 56, 45, 67 });
		// s1.forEach(x->System.out.println(x));

		ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(10, 20, 30, 56, 45, 67));
		// System.out.println(l1);

		// converting ArrayList to Stream
		Stream<Integer> s2 = l1.stream();
		// System.out.println(s2); //no output
		// s2.forEach(y -> System.out.println(y)); // converted to stream

		Stream<Date> d = Stream.generate(() -> {
			return new Date();
		});
		// d.forEach(e -> System.out.println(e));

		Stream<String> s3 = Stream.of("A$B$C$D".split("\\ $"));
		// s3.forEach(p -> System.out.println(p));

		List<Integer> l2 = s2.filter(i -> i % 2 == 0).collect(Collectors.toList());
		// System.out.println(l2);

		ArrayList<String> names = new ArrayList<>(Arrays.asList("abc", "ade", "ert", "aty", "ghj"));
		// names.stream().filter(p-> p.startsWith("a")).forEach(System.out::println);
		//names.stream().filter(p -> p.startsWith("a")).map(String::toUpperCase).forEach(System.out::println);
        
		names.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
	}

}
