package com.interview.asked;

public class Program_6_ThirdHighestFromArray_1 {

	public static void main(String[] args) {
		
		
		int[] arr = {0,4,1,5,6,10,3,9,2,7};
		
		
		int res = getThirdHigestNumber(arr);
		
		System.out.println("Third Highest: "+res);
		

	}

	private static int getThirdHigestNumber(int[] arr) {
		
		int f=Integer.MIN_VALUE, s=Integer.MIN_VALUE, third = Integer.MIN_VALUE;
		
		for(int i=0;i<10;i++) {
			
			if(arr[i]>f) {
				third=s;
				s=f;
				f=arr[i];
			} else if(arr[i]>s && arr[i]!=f ) {
				third=s;
				s=arr[i];
			} else if(arr[i]>third && arr[i]!=f && arr[i]!=s) {
				third=arr[i];
			}
		}
		return third;
	}

}
