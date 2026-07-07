package com.java8.practice.paractice3;

import java.util.List;
import java.util.function.BiPredicate;
import com.java8.practice.data.Student;
import com.java8.practice.data.StudentDataBase;
import java.util.function.Consumer;

public class BiPredicateExample {
	static BiPredicate<Integer, Double> bipredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 6 ;


	static Consumer<Student> consumer = student -> {
		if(bipredicate.test(student.getGradeLevel(), student.getGpa())) {
		System.out.println(student);	
	}
	};
	public static void filterStudents() {
		List<Student> studentlisyt = StudentDataBase.getAllStudent();
		studentlisyt.forEach(consumer);
	}

	public static void main(String[] args) {
		filterStudents();

	}

}
