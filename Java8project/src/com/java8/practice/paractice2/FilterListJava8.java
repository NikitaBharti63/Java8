package com.java8.practice.paractice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterListJava8 {

	public static void main(String[] args) {
		List<String> x = Arrays.asList("abc", "def", "ghi");
	    //x.forEach(System.out::println);
	    
	   List<String> y =  x.stream()
	             .filter(z ->!"abc".equals(z))
	             .collect(Collectors.toList());
	   y.forEach(System.out::println);
	             
	}

}
