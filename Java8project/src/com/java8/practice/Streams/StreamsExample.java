package com.java8.practice.Streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.java8.practice.data.Student;
import com.java8.practice.data.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {
		Predicate<Student> gradePredicate = Student -> Student.getGradeLevel() >= 3;

		
		Map<String, List<String>> mapStudent = StudentDataBase.getAllStudent().stream()
				.filter(gradePredicate)
				.collect(Collectors.toMap(Student::getName, Student::getActivities,(oldVal, newVal)-> newVal));
		System.out.println("StudentMap : "+mapStudent);
	}

}
