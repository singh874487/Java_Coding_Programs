package com.arjun.java.java8.examples;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Prog_32_Find_Age_Of_A_Person_In_Years_If_Age_Is_Given {
	public static void main(String[] args) {
		
		LocalDate birthDay = LocalDate.of(1985, 01, 23);
		LocalDate today = LocalDate.now();

		System.out.println(ChronoUnit.YEARS.between(birthDay, today));

	}
}