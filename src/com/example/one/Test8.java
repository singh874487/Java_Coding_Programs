package com.example.one;

import java.util.HashSet;
import java.util.Set;

public class Test8 {

	public static void main(String[] args) {

		String s = "ABC"; 
		int len = s.length();
		
		char[] array = s.toCharArray();
		//String tmp ="";
		
		Set<String> set = new HashSet<>();
		
		for(int i=0;i<s.length();i++) {
			
		//	tmp = ""+array[i] +  ;
			
			Set<String> tempSet = getSubstring(array[len-i-1],array[len-i] );
			for(String st: tempSet) {
				String t = ""+array[i]+st;
				set.add(t);
			}
			
		}
		 
	}

	// i=0, i+1, i+2 .. i=1, i-1, i+1, i=2,i-1,i-2
	// 3-i-1, 3-i-2 

	public static Set<String> getSubstring(char a, char b) {
		Set<String> set = new HashSet<>();
		set.add("" + a + b);
		set.add("" + b + a);
		return set;

	}
	 
	
	
	
	
	
	
	
	
}
