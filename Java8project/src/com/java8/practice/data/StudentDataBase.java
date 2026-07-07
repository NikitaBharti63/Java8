package com.java8.practice.data;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDataBase {

	public static Supplier<Student> studentSupplier = () -> {
		return new Student("Adam", 2, 4.0, "male", Arrays.asList("Swimming", "reading"));
	};

	public static Optional<Student> getOptionalStudent() {
		Student student = new Student("Adam", 2, 4.0, "male", Arrays.asList("Swimming", "reading"));
		Bike bike = new Bike("Client123", "Client123");
		student.setBike(Optional.of(bike));
		return Optional.of(student);
	}

	/* Total 6 student in db */
	public static List<Student> getAllStudent() {
		Student student1 = new Student("Adam", 2, 3.4, "male", Arrays.asList("Swimming", "reading"));
		Student student2 = new Student("Smith", 2, 4.7, "Female", Arrays.asList("chess", "football"));

		Student student3 = new Student("Jenny", 3, 6.0, "Female", Arrays.asList("poetry", "running"));
		Student student4 = new Student("Jame", 3, 5.0, "male", Arrays.asList("Knitting", "Writting"));

		Student student5 = new Student("jasmin", 4, 7.0, "Female", Arrays.asList("Swimming", "flying"));
		Student student6 = new Student("jacob", 4, 3.0, "male", Arrays.asList("Cooking", "basketball"));

		List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6);

		return students;

	}
}
