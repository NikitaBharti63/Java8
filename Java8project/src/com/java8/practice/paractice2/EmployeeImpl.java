package com.java8.practice.paractice2;

public class EmployeeImpl implements Employee {
	
	// Abstract methods-- example for default
	@Override
	public void populate() {
		System.out.println("Populate the info");
	}
	public void display() {
		Employee.super.display();
		Employee.super.process();
	}
	
	public static void main(String[] args) {
		//Create the instance
		EmployeeImpl emp = new EmployeeImpl();
		emp.display();
		emp.process();
	}

}
