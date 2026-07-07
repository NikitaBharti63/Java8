package com.java8.practice.lambdas;

import java.util.function.Consumer;
public class LambdaVariable1 {

	public static void main(String[] args) {
		int x= 0; //local variable
		//local variable name and lambda expression parameter won't be same(if same error)
		
		Consumer<Integer> c = (x1) -> {
			//int x =1; --can't change the value of local variable;
			System.out.println(x1);
		};

	}

}
