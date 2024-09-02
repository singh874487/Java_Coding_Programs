package com.simple2.basics.string;

public class Test4 {

	public static void main(String[] args) {

		String s1 = "​​123";
		String s2 = "56";

		String s3 = getMultiplication(s1, s2);

		System.out.println(s3);

	}

	private static String getMultiplication(String s1, String s2) {

		Integer v1 = Integer.valueOf(s1);
		Integer v2 = Integer.valueOf(s2);
		
		int result=0;
		
		while(v2!=0) {
			
			int a = v2%10;
			result = result*10+a;
			
		}

		Integer mul = v1 * v2;
		return mul.toString();
	}

}



