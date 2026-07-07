package com.java8.practice.paractice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterList {

	public static void main(String[] args) {
		List<String> x = Arrays.asList("abc", "def", "ghi");
		// x.forEach(System.out::println); //if you want to print x
		List<String> z = f1(x, "abc");
		for (String i : z) {
			System.out.println(i);
		}

	}

	private static List<String> f1(List<String> x, String msg) {
		List<String> z = new ArrayList<>();
		for (String y : x) {
			if (!"abc".equals(y)) {
				z.add(y);
			}
		}
		return z;
	}

}
