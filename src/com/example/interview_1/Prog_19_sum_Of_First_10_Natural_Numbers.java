package com.example.interview_1;

import java.util.stream.IntStream;

public class Prog_19_sum_Of_First_10_Natural_Numbers {
	public static void main(String[] args) {

		int sum = IntStream.range(1, 11).sum();

		System.out.println(sum);

	}
}