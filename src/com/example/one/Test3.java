package com.example.one;

 

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {
		
		
	List<Integer> list =  	Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
	
	Map<Boolean, List<Integer>> mapOfOddEven =  list.stream().collect(Collectors.groupingBy(a->a%2==0));
	
	Set<Entry<Boolean, List<Integer>>> entrySet =  mapOfOddEven.entrySet();
	
	for(Entry<Boolean, List<Integer>> entry: entrySet) {
		System.out.println("------------------------");
		if(entry.getKey()) {
			System.out.println("Even Numbers");
		}else {
			System.out.println("Odd Numbers");
		}
		
		System.out.println("------------------------");
		List<Integer> list2 = entry.getValue();
		for(Integer i : list2) {
			System.out.println(i);
		}
		
		
	}

	}

}
