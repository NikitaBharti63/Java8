package com.exp.array;

import java.util.Arrays;
import java.util.List;

public class secondMaxElement {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,3,4,5,7);
		int larg = Integer.MIN_VALUE;
		int secLarg = Integer.MIN_VALUE;
		
		for(int num: list) {
			if(num>larg) {
				secLarg =larg;
				larg =num;
			}else if(num>secLarg && num!=larg) {
				secLarg =larg;
			}
		}
		System.out.println(secLarg);
		

	}

}
