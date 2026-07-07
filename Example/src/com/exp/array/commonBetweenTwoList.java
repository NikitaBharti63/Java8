package com.exp.array;

import java.util.Arrays;
import java.util.List;

public class commonBetweenTwoList {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,3,4,5,7);
		List<Integer> list2 = Arrays.asList(1,2,3,4,5,7,9);
		
		for(Integer num : list1) {
			if(list2.contains(num)) {
				System.out.println(num);
			}
		}

	}

}
