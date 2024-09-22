package com.arjun.java.java8.examples;

import java.util.stream.IntStream;

public class Prog_21_Frst_10_Even_Numbers {
	public static void main(String[] args) {
		
		IntStream.rangeClosed(1, 10)
				 .map(i -> i * 2)
				 .forEach(System.out::println);

	}
}