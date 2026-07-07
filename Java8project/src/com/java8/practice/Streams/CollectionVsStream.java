package com.java8.practice.Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionVsStream {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Niki");
		names.add("Rahi");
		names.add("Pihu");
		Stream<String> nameStream = names.stream();
		nameStream.forEach(System.out::println);

	}

}
