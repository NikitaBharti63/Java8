package com.java8.practice.paractice2;

import java.util.function.Predicate;

public class Predicatedemo {

	public static void main(String[] args) {
		// Greater than
		Predicate<Integer> p = a -> (a > 30);
		System.out.println(p.test(20));
		System.out.println(p.test(30));
		System.out.println(p.test(50));

		// Length of the string
		Predicate<String> p1 = b -> (b.length() > 3);
		System.out.println(p1.test("Niki"));
		System.out.println(p1.test("Pooja"));
		System.out.println(p1.test("Amimesha"));

		// predicate copy
		int[] x1 = { 12, 20, 23, 45, 57, 40, 50, 60, 70, 80, 90 };
		Predicate<Integer> p2 = x -> (x > 40);
		Predicate<Integer> p3 = y -> (y % 2 == 0);

		System.out.println("Greater than 40 are: ");
		f1(p2, x1);

		System.out.println("Even number are : ");
		f1(p3, x1);

		System.out.println("Not greater than 40: ");
		f1(p2.negate(), x1);
		
		System.out.println("Greated than 40 and even :");
		f1(p2.and(p3), x1);
		
		System.out.println("Greated than 40 or even :");
		f1(p2.and(p3), x1);
	}

	static void f1(Predicate<Integer> p, int[] x1) {
		for (int a : x1) {
			if (p.test(a)) {
				System.out.println(a);
			}
		}
	}

}
