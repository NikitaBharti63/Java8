package com.exp.array;

import java.util.Arrays;
import java.util.List;

public class maximumElement {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,3,4,5,7);
		int max= list.get(0);
		for(Integer num :list) {
			max = num;
		}
      System.out.println(max);
	}

}
