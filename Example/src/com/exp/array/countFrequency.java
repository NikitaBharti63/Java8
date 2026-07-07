package com.exp.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


public class countFrequency {

	public static void main(String[] args) {
		//List<String> list = Arrays.asList("A","B","A");
		List<Integer> list = Arrays.asList(1,2,3,4,5,4,3,2,1);
		Map<Integer, Integer> map = new HashMap<>();
		
		for(Integer nums : list) {
			if(map.containsKey(nums)) {
				map.put(nums, map.get(nums)+1);
			}else {
				map.put(nums, 1);
			}
		}
		
       System.out.println(map);
	}

}
