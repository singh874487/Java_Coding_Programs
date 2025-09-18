package com.interview.internals;

public class Program_3_Null_With_Overloading_1 {

	public static void main(String[] args) {

		someMethod(null);
		
		someMethod((Object) null); // Explicitly calls someMethod(Object s)
	}

	public static void someMethod(Object o) {

		System.out.println("Object method Invoked");

	}

	public static void someMethod(String s) {

		System.out.println("String method Invoked");

	}

}


 


/*

Compile-Time vs. Run-Time:

Method overloading is resolved at compile time based on the reference type, not the actual object (because null doesn’t have a runtime type).
The String method is chosen at compile time because String is a more specific type than Object for the null reference.


Detailed Explanation:

This behavior revolves around method overloading and how Java determines which method to invoke when multiple overloaded methods are available. 
Let's break down the program step by step to understand why the String version of someMethod is invoked when null is passed as an argument.

1. Understanding Method Overloading

Method Overloading in Java allows a class to have more than one method with the same name, 
provided their parameter lists (types and/or number of parameters) are different. 
The compiler differentiates these methods based on their signatures.

In the given TestClass, there are two overloaded versions of the someMethod:

First Method: Accepts an Object as a parameter.
Second Method: Accepts a String as a parameter.


2. The main Method Invocation

In the main method, someMethod is called with null as an argument:


3. How Java Resolves the Method Call

When someMethod(null) is called, Java needs to determine which overloaded version of someMethod to invoke. Here's how Java makes this decision:

Identify Applicable Methods:

Both someMethod(Object o) and someMethod(String s) can accept null as an argument because null can be assigned to any reference type.
Determine the Most Specific Method:

Java prefers the most specific method applicable to the arguments provided.

Specificity Hierarchy: In Java, String is a subclass of Object. This means String is more specific than Object.
Since String is a subclass of Object, the method someMethod(String s) is considered more specific than someMethod(Object o).
Method Selection:

Given that both methods are applicable, but someMethod(String s) is more specific, Java selects someMethod(String s) for invocation.


4. Final Output

As a result of the above resolution process, the someMethod(String s) is invoked, and the following line is printed to the console:

o/p
String method Invoked


Summary

Even though null can fit both Object and String parameters, the String method is chosen because it is the more specific type, leading to the output:


*/