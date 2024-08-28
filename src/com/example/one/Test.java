package com.example.one;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);

		List<Integer> sortedList = list.stream()
				.sorted((i1, i2) -> i2.compareTo(i1))
				.collect(Collectors.toList());
		System.out.println(sortedList);
		
		
		boolean b = list.stream().anyMatch(a->(a==4));
		
		
		
	}

}
