package com.java8.practice.paractice2;

public interface Employee {
	public void populate();

	default void display() {
		System.out.println("Welcome to default method");
	}

	default void process() {
		System.out.println("Hello , Welcome to default");
	}
}
