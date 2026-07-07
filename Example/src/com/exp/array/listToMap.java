package com.exp.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class listToMap {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,3,4,5,7);
		Map<Integer, Integer> map = new HashMap<>();
		for(Integer num : list) {
			map.put(num, num);
		}
		System.out.println(map);
	}

}
