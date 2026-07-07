package com.java8.practice.lambdas;

import java.util.stream.IntStream;

//Sum of integers for the range(0,100).
public class ImperativeVsDeclarative1 {

	public static void main(String[] args) {
		//Imperative
		int sum =0; //local variable---mutable variable
		for(int i=0; i<=100; i++) { // explicit iteration & if we are trying in to multithreaded environment we will face the issue.
			sum += i;
		}
		System.out.println("Sum is : " +sum);
		
		//Declarative ---style of programming
		int sum1 = IntStream.rangeClosed(0, 100) // Internal iteration
				//.parallel()    // it splits the values and performs the summation in multi threaded environment.
				//.map(Integer::new)
				.sum();
		System.out.println("Sum is : " +sum1);

	}

}
