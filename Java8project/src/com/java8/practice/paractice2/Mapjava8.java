package com.java8.practice.paractice2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Mapjava8 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "abc");
		map.put(2, "cde");
		map.put(3, "ghu");
		map.put(5, "hji");
		map.put(6, "hjk");
		map.put(7, "kki");
		
		//Map ---> stream ->filter ---> Map
		Map<Integer, String> m = map.entrySet()
				.stream()
				.filter(a -> a.getKey() == 3)
				.collect(Collectors.toMap(p->p.getKey(), p->p.getValue()));
		System.out.println(m);

	}

}
