package com.interview.internals;

public class Program_2_Wrapper_Integer_Classes_2 {

	public static void main(String[] args) {
		
		
		int x = 250;
		Integer y = 250;
		
		System.out.println(x == y);    // Reference comparison
		System.out.println(y.equals(x)); // Content comparison
		
							/* Output
							
							x == y: true
							y.equals(x): true
							
							*/
		System.out.println("-----------------------------------");
		
		
		 

	}

}



/*
 
 
 
  When you have the following code in Java:

 
int i = 250;
Integer j = 250;

It involves both a primitive type (int) and a wrapper class type (Integer). 
Java performs autoboxing and unboxing to handle conversions between these two types seamlessly.



Key Concepts:

Primitive int: A simple data type that directly holds the value (in this case, 250).
Wrapper class Integer: An object type that wraps a primitive int in an Integer object.

What Happens Internally:

Autoboxing (Converting int to Integer):

The assignment Integer j = 250; triggers autoboxing. This means that the primitive int value 250 is automatically converted into an Integer object.
Java uses the Integer.valueOf(250) method to perform this conversion.

Unboxing (Converting Integer to int):

When necessary, Java automatically converts the Integer object back to a primitive int. 
For example, if you perform arithmetic operations between i and j, unboxing occurs.

Java uses the intValue() method internally for unboxing.

Comparing int and Integer:

If you compare i and j using ==, the primitive value of j will be unboxed to an int, and a direct comparison of the two int values will occur.


int i = 250;
Integer j = 250;

System.out.println(i == j); // true

Unboxing: Here, j (which is an Integer) is unboxed to its primitive value (250), and i == j becomes 250 == 250, which is true.


Important Notes:

The autoboxing mechanism does not impact the comparison in this case, because when you compare a primitive int with an Integer object, 
Java automatically converts the Integer object into a primitive int for comparison.

This comparison would return true for any integer value, whether it is inside or outside the range of -128 to 127, 
because Java is comparing primitive values after unboxing.

Example for Further Clarity:

int i = 250;
Integer j = 250;

System.out.println(i == j);  // true - Unboxing happens, and both values are compared as primitives.
System.out.println(i == 250); // true - Both are primitive values, so this is a direct comparison.
System.out.println(j.equals(i)); // true - Unboxing happens, and the content comparison occurs using equals().

Summary:

Autoboxing: The Integer j = 250; creates an Integer object wrapping the primitive value 250.
Unboxing: When you compare int i = 250; and Integer j = 250; using ==, Java unboxes the Integer to a primitive int, and it performs a direct value comparison.

Result: The comparison i == j returns true because both values are equal after unboxing.

--------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------




*/