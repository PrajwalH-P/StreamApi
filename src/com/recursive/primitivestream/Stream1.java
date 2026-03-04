package com.recursive.primitivestream;

import java.util.stream.IntStream;

public class Stream1 {
	public static void main(String[] args) {
		IntStream.range(0, 10).forEach(System.out::println);
		System.out.println("----------------------------------");
		IntStream.rangeClosed(1, 15).forEach(System.out::println);
		System.out.println("----------------------------------");

		int sum = IntStream.rangeClosed(1, 5).sum();
		System.out.println("Sum of first natural numbers is " + sum);
		System.out.println("---------------------------------------------");

		double avg = IntStream.range(1, 5).average().getAsDouble();

		System.out.println("Average of first 5 natural number is " + avg);

	}
}
