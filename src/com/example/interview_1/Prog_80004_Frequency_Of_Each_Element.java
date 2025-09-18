package com.example.interview_1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Prog_80004_Frequency_Of_Each_Element {

	public static void main(String[] args) {
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        
        Map<String, Long> stationeryCountMap = 
                stationeryList.stream()
                			  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
         
        System.out.println(stationeryCountMap);
	}

}
