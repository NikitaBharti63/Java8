package com.java8.practice.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Remove Duplicates from the list
public class ImperativeVsDeclarative2 {

	public static void main(String[] args) {  
		//------Imperative style 
		/*List<Integer> list = Arrays.asList(2,3,4,5,5,6,7,4,5,3,9,11);
		Set<Integer> set = new LinkedHashSet<>(list);
		System.out.println(set);
		
        --------------------
         
		List<Integer> list1 = Arrays.asList(2,3,4,5,5,6,7,4,5,3,9,11);
		Set<Integer> unique = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		
		for(int num : list1) {
			if(!unique.add(num)) {
				duplicate.add(num);
			}
		}
		System.out.print(duplicate);
		
	    -----------------------
		List<Integer> list = Arrays.asList(2,3,4,5,5,6,7,4,5,3,9,11);
		Set<Integer> set = new LinkedHashSet<>(list);
		System.out.print(set);
		*/
		
		//Declarative Style
		List<Integer> intlist1 = Arrays.asList(2,3,4,5,5,6,7,4,5,3,9,11);
		
		  List<Integer> unique = intlist1.stream()
				.distinct()
				. collect(Collectors.toList());
		System.out.println(unique);
		};
}
