package com.arjun.java.java8.examples;

import java.util.Arrays;

public class Prog_1016_Sum_And_Average_Of_All_Integer_Array_Elements {
	
	public static void main(String[] args) {

		int[] a = new int[] { 45, 12, 56, 15, 24, 75, 31, 89 };

		int sum = Arrays.stream(a).sum();

		System.out.println("Sum = " + sum);

		double average = Arrays.stream(a).average().getAsDouble();

		System.out.println("Average = " + average);

	}
}