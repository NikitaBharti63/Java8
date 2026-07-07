package com.java8.practice.paractice2;
import java.util.function.Function;

public class Functiondemo {

	public static void main(String[] args) {
		Function<String, Integer> f = x-> x.length();
		System.out.println(f.apply("Ravi"));
		System.out.println(f.apply("Mohini"));

	}

}
