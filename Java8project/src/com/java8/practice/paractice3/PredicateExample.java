package com.java8.practice.paractice3;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> p = (i) -> {
		return i % 2 == 0;
	};
	static Predicate<Integer> p1 = (i) -> i % 2 == 0;
	static Predicate<Integer> p2 = (i) -> i % 5 == 0;

	public static void predicateAnd() {
		System.out.println("Result in PredicateAnd : " + p1.and(p2).test(10));
	}

	public static void main(String[] args) {
		System.out.println("Result is p : " + p.test(2));
		System.out.println("Result is p1 : " + p1.test(3));

		predicateAnd();

	}

}
