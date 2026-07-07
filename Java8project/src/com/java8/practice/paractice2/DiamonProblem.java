package com.java8.practice.paractice2;

interface i1 {
	void abc(); // abstract method

	public default void display() {
		System.out.println("this is i1 default nmethod");
	}

	public static void demo() {
		System.out.println("this is i1 static nmethod");
	}
}

interface j1 {
	void abc(); // abstract method

	public default void display() {
		System.out.println("this is j1 default nmethod");
	}

	public static void demo() {
		System.out.println("this is j1 static nmethod");
	}
}

class A implements i1, j1 {
	public void display() {
		System.out.println("A");
		i1.super.display();
		j1.super.display();
	}

	public void abc() {
		System.out.println("in A class abc method");
	}

}

public class DiamonProblem {

	public static void main(String[] args) {
		A a1 = new A();
		a1.display(); // method call
		a1.abc();

		i1.demo();
		j1.demo();

	}
}
