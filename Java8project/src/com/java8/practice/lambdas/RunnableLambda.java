package com.java8.practice.lambdas;

public class RunnableLambda {
	public static void main(String[] args) {
		// prior to java 8
		Runnable runnable = new Runnable() {

			public void run() {
				System.out.println("Inside Runnable 1 : ");
			}
		};
		new Thread(runnable).start();

		// If you are using Java 8
		// ()->{} Assigned as a lambda variable
		Runnable runnablelambda = () -> {
			System.out.println("Inside Runnablelambda 2 : ");
		};
		new Thread(runnablelambda).start();
		
		//or
		new Thread(() -> System.out.println("Inside Runnable 3 : ")).start();
		
		//or
		new Thread(new Runnable() {
			public void run() {
				System.out.println("Inside Runnable 4 : ");
			}
		}).start();
		
		Runnable runnablelambda2 = () ->{
			System.out.println("Inside runnablelambda2 5 : ");
			System.out.println("Inside runnablelambda2 6 : ");	
		};
		new Thread(runnablelambda2).start();	
	}
}
