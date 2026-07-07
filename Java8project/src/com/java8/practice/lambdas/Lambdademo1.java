package com.java8.practice.lambdas;

interface Sum {
	int add(int a, int b);

}
public class Lambdademo1 {

	public static void main(String[] args) {
		
		//without return keyword
		Sum add1 =(a,b)->(a+b);
		System.out.println(add1.add(100, 200));
		
		Sum add2 =(int a, int b)->(a+b);
		System.out.println(add2.add(1000, 500));

		
		//with return keywords
		Sum add = (int a, int b)->{
			return (a+b);
		};
		System.out.println(add2.add(600, 500));
	}

}
