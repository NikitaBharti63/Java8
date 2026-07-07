package com.java8.practice.paractice2;

interface MyInterface {
	// default void method1() {
	static void method1() {
		// calling Static & private method
		//f1();
		System.out.println(" Inside method 1");
	}

	//default void method2() {
	static void method2() {
		// calling Static & private method
		//f1();
		System.out.println(" Inside method 2");
	}

	/*private void f1() {
		// static void f1() {
		// System.out.println(" Inside static f1");
		System.out.println(" Inside private f1");

	}*/
	default void m3() {
		method1();
		method2();
	}

}

public class PrivateStaticInterfacedemo implements MyInterface {

	public static void main(String[] args) {

		PrivateStaticInterfacedemo pSI = new PrivateStaticInterfacedemo();
//		pSI.method1();
//		pSI.method2();
		pSI.m3();
	}

}
