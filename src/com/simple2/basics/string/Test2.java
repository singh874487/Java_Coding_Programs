package com.simple2.basics.string;

import java.util.ArrayList;
import java.util.List;

//M, MaI, MaIN, IN,I,N
public class Test2 {

	public static void main(String[] args) {

		String s = "MaIN";
		//String result = "";
		StringBuffer sb = new StringBuffer();

		int count = 0;
		
		List<String> l = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {

			if (Character.isUpperCase(s.charAt(i))) {
			//	System.out.println(s.charAt(i));
				sb.append(s.charAt(i));
				l.add(String.valueOf(s.charAt(i)));
				
				

			for (int j = i+1; j < s.length(); j++) {

				 
					if (!Character.isUpperCase(s.charAt(j))) {
						sb.append(s.charAt(j));
					} else if (Character.isUpperCase(s.charAt(j))) {
						sb.append(s.charAt(j));
					//	System.out.println(sb);
						//end = 1;
						l.add(sb.toString());
						
					}
				 
			}
	//		System.out.println(sb);
			sb = new StringBuffer();
			
			
			 
			}
		}
		System.out.println(l);
	}

}
