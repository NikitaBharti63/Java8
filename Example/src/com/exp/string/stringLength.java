package com.exp.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class stringLength {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Programming", "Spring");
		Map<String, Integer> map = new HashMap<>();
		for(String str : list) {
			map.put(str, str.length());
		}
		System.out.println(map);
	}

}
