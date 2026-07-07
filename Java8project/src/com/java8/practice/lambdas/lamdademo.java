package com.java8.practice.lambdas;

interface Sample {
	public void f1();

}

public class lamdademo {

	public static void main(String[] args) {
		int x = 100;
		/* instance --- Without lambda
		Sample s = new Sample() {
		public void f1() {
			System.out.println("Result is : " + x);
			}
		};
		s.f1(); */
		//with using lambda
		
		Sample s = ()->{
			System.out.println("Result is : " + x);	
		};
		s.f1();
	}
}
