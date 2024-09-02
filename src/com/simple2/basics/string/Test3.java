package com.simple2.basics.string;

class A {
	
	
	static {
		System.out.println("static A");
	}
	
	{
		System.out.println("A Block");
	}
	
	public A() {
		System.out.println("A const");
	}
}
public class Test3 extends A {
	
	{
		System.out.println("B block");
	}
	
	Test3(){
		System.out.println("B const");
	}
	
	

	public static void main(String[] args) {
 
			new Test3();
	}

}
