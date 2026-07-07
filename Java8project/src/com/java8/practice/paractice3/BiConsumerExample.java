package com.java8.practice.paractice3;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.java8.practice.data.Student;
import com.java8.practice.data.StudentDataBase;

public class BiConsumerExample {
	public static void nameAndActivities() {
		BiConsumer<String, List<String>> studentBiConsumer =(name, activities) -> 
		System.out.println(name +" : " + activities);
		
		Consumer<String> stringConsumer = (name) -> System.out.println("name is :"+name);
		 List<Student> students = StudentDataBase.getAllStudent();
		 students.forEach((s) -> studentBiConsumer.accept(s.getName(), s.getActivities()));
	}

	public static void main(String[] args) {
		BiConsumer<String, String> biConsumer = (a,b) -> {
			System.out.println(" a :" +a +" b : " +b);
		};
		biConsumer.accept("java7", "java8");

	}

}
