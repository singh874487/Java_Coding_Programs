package com.interview.asked;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program_7_OccurenceOfIntegerNumber {

	public static void main(String[] args) {
		
		

List<Integer> list = Arrays.asList(1,2,3,3,1,4,6,7,8);

Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),  Collectors.counting()));

map.forEach((a,b)->System.out.println(a+":"+b));
		 
	}
 

}
