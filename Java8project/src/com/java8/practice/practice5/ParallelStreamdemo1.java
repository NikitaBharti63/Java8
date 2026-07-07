package com.java8.practice.practice5;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamdemo1 {
	public static long performancecheck(Supplier<Integer> sum, int numberofTimes) {
		long start = System.currentTimeMillis();
		for(int i=0; i<numberofTimes; i++) {
			sum.get();
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static int sum_sequential_stream() {
		int total = IntStream.range(1, 1000000).sum();
		return total;
		}
	
	public static int sum_parallel_stream() {
		int total1 = IntStream.range(1, 1000000)
			 	.parallel() // Splits the data into multiple parts
				.sum();  // performs the sum of the individual parts and consolidate.
		return total1;
		}
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		long sequesntialDuration = performancecheck(ParallelStreamdemo1::sum_sequential_stream, 20);
	     System.out.println("Sequential Duration in milisec : " +sequesntialDuration);
	     
	     long parallelDuration = performancecheck(ParallelStreamdemo1::sum_parallel_stream, 20);
	     System.out.println("Sequential Duration in milisec : " +parallelDuration);
	}
	

}
