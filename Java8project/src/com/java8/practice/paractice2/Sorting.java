package com.java8.practice.paractice2;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		List<Developer> listDev = getDevelopers();
		System.out.println("Before sorting : ");
		for (Developer developer : listDev) {
			System.out.println(developer);
		}
		System.out.println("After sorting : ");
		// listDev.sort((Developer d1, Developer d2) -> d1.getAge()- d2.getAge());
		// listDev.forEach((developer)-> System.out.println(developer));
		Comparator<Developer> salaryComp = (d1, d2) -> Double.compare(d1.getSalary(), d2.getSalary());
		Collections.sort(listDev, salaryComp);
		listDev.forEach(developer-> System.out.println(developer));
//		for (Developer d : listDev) {
//			System.out.println(d);
//		}
	}

	private static List<Developer> getDevelopers() {
		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("Nikita", 303003, 26));
		result.add(new Developer("sonal", 3088.00, 28));
		result.add(new Developer("vasu", 99993.00, 25));
		result.add(new Developer("Rashi", 900003.00, 24));
		return result;
	}
}
