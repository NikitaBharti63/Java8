package com.java8.practice.paractice3;

import java.util.function.Function;

public class FunctionExample {
	static Function<String, String> upperCase = (name) -> name.toUpperCase();
	static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("Java");

	public static void main(String[] args) {
		System.out.println(" Result is: " + upperCase.apply("Java8"));
		System.out.println(" Result is and then : " + upperCase.andThen(addSomeString).apply("java8"));

		Function<String, String> abc = Function.identity();
		System.out.println(abc.apply("XYZ"));

	}

}
