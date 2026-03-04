package com.recursive.primitivestream;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Stream2 {
	public static void main(String[] args) {
		
		//Print Even Numbers
		IntStream.range(0, 10)
				 .filter(value->value%2==0)
				 .forEach(System.out::println);
		
		
		//Number of Odd digits
		
		long ocount = IntStream.range(1, 10)
								.filter(v->v%2==1)
								.count();
		
		System.out.println("Number Of Odd Digits "+ocount);
		
		//2 Digits pallindrome
		IntStream.range(10, 100)
				 .filter(n->n%11==0)
				 .forEach(System.out::println);
	}
}
