package com.arjun.java.java8.examples;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Prog_27_First_Repeated_Character_In_A_String {
	public static void main(String[] args) {
		
		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        
        Map<String, Long> charCountMap = 
            Arrays.stream(inputString.split(""))
                  .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
         
        String firstRepeatedChar = charCountMap.entrySet()
                                                .stream()
                                                .filter(entry -> entry.getValue() > 1)
                                                .map(entry -> entry.getKey())
                                                .findFirst()
                                                .get();
         
        System.out.println(firstRepeatedChar);
	}
}