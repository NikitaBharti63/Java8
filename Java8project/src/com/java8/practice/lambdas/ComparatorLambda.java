package com.java8.practice.lambdas;

import java.util.Comparator;

//accept comparator obj and integer a and b --- used to initiliased the obj
// compareTwoInteger is static utility method that accepts a comparator obj and two integer values.
// it delegates the comparison to the comparator's compare() and return the values.
public class ComparatorLambda {
//	public static int compareTwoInteger(Comparator<Integer> comparator, int a, int b) {
//		return comparator.compare(a, b);
//	}

	public static void main(String[] args) {
		//prior to java8
		Comparator<Integer> comparator = new Comparator<Integer>() {

			public int compare(Integer i1, Integer i2) {
				return i1.compareTo(i2);
			}
		};
		System.out.println(comparator.compare(10, 12)); // if i1=i2 -> 0 & i1>i2 -> 1 & i1<i2 -> -1
    
	//Using Java 8
		Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b); //compareTo is a method of the Integer class(Wrapper).
		System.out.println(comparatorLambda.compare(5, 5));
		 
		//or 
		Comparator<Integer> comparatorLambda1 = (a, b) -> a.compareTo(b); //compareTo is a method of the Integer class(Wrapper).
		System.out.println("result is : " +comparatorLambda1.thenComparing(comparatorLambda1).compare(15, 5));
		System.out.println(comparatorLambda1.compare(40, 40));
	}
	

}
