package com.java8.practice.paractice3;

import com.java8.practice.data.Student;
import com.java8.practice.data.StudentDataBase;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Constructorreference {

	static Supplier<Student> studentsupplier = Student::new;
	static Function<String, Student> studentFunction = Student::new;

	// Student student = student::new; -- constructor reference

	public static void main(String[] args) {

		System.out.println(studentsupplier.get());
		System.out.println(studentFunction.apply("Niki"));
	}

}
