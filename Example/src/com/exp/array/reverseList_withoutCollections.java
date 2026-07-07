package com.exp.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reverseList_withoutCollections {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,2,3,5);
		
		int start =0;
		int end = list.size()-1;
		
		while(start<end) {
			Integer temp = list.get(start);
			list.set(start, list.get (end));
			list.set(end, temp);
			start ++;
			end --;	
		}
		System.out.println(list);

	}

}
