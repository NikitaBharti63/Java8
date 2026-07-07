package com.java8.practice.lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {
	
    static int y = 10; // static variable (instance)
	public static void main(String[] args) {
		//int y = 5; // effectively final-- we can't change the variable value
		// if it is declared as the local variable.

		Consumer<Integer> c = (y1) -> {
			// y++; -- can't increment the local variable. 
			y++; // increment is possible due to static variable
			System.out.println(y1 + y);
		};
		c.accept(3);

	}

}
