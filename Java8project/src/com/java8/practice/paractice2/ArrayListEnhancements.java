package com.java8.practice.paractice2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayListEnhancements {
	static List<String> names = Arrays.asList("nikita", "sonal", "Pooja", "Ruhi");

	static void listforEach() {
		for (String s : names) {
			System.out.println(s);
		}
		names.forEach((s) -> System.out.println(s));
		names.forEach((s) -> System.out.println(s));

		List<String> string = Arrays.asList("one", "Two", "Three", "Four", "Five");
		AtomicInteger count = new AtomicInteger();
		string.forEach((name) -> {
			System.out.println("name " + name);
			System.out.println(count.getAndIncrement());
		});
	}
}
