package com.exp.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class removeDuplicate {

	public static void main(String[] args) {
			List<Integer> list = Arrays.asList(1,2,3,3,4,5,7);
			Set<Integer> set = new LinkedHashSet<>(list);
	
	System.out.println(set);
	}
}
