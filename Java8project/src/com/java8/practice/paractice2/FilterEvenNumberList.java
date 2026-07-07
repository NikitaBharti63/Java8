package com.java8.practice.paractice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumberList {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1, 3, 2, 4, 5);
		
		List<Integer> b = a.stream()
				.filter(c -> (c%2) == 0 )
				.collect(Collectors.toList());
		b.forEach(System.out::println);

	}

}
