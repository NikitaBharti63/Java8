package com.java8.practice.paractice3;

import java.util.List;
import java.util.function.Consumer;
import com.java8.practice.data.Student;
import com.java8.practice.data.StudentDataBase;

// Consume the i/p but no return type for this.
public class ConsumerExample {
	static Consumer<Student> c1 = p -> System.out.println(p);
	static Consumer<Student> c2 = p -> System.out.print(p.getName().toUpperCase());
	static Consumer<Student> c3 = p -> System.out.print(p.getActivities());
	static Consumer<String> c4 = s -> System.out.println(s.toUpperCase());

	public static void printname() {
		List<Student> personList = StudentDataBase.getAllStudent();
		personList.forEach(c1);

	}

	public static void printNameAndActivities() {
		System.out.println("printNameAndActivities");
		List<Student> personList = StudentDataBase.getAllStudent();
		personList.forEach((s) -> {
			if (s.getGradeLevel() >= 3 && s.getGpa() > 3.9) {
				c2.andThen(c3).accept(s);
			}
		});
	}
	public static void main(String[] args) {
		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
		c1.accept("java8");
		printname();
		printNameAndActivities();
		c4.accept("abc");
		
	}

}
