package com.exp.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Set doesn't allow duplicates.
public class duplicatesElement {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,3,4,5,7);
		Set<Integer> unique = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		
		for(Integer nums : list) {
			if(!unique.add(nums)) {
				duplicate.add(nums);
			}
		}
		System.out.println(duplicate);

	}

}
