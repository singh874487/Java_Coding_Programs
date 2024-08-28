package com.example.interview_1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prog_13_Sum_Of_All_Digits_of_A_Nmber {
	public static void main(String[] args) {
		int i = 15623;

		Integer sumOfDigits = Stream.of(String.valueOf(i).split(""))
									.collect(Collectors.summingInt(Integer::parseInt));

		System.out.println(sumOfDigits);
	}
}