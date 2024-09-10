package com.interview.internals;

public class Program_2_Wrapper_Integer_Classes_1 {

	public static void main(String[] args) {
		
		
		// Case 1: Values between -128 and 127
		System.out.println("Case 1: Values between -128 and 127");
		
		Integer x = 100;
		Integer y = 100;
		
		System.out.println(x == y);    // Reference comparison
		System.out.println(x.equals(y)); // Content comparison
		
							/* Case 1: Output
							
							x == y: true
							x.equals(y): true
							
							*/
		System.out.println("-----------------------------------");
		
		
		
		
		
		// Case 2: Values outside -128 to 127
		System.out.println("Case 2: Values outside -128 to 127");
		
		Integer a = 250;
		Integer b = 250;

		System.out.println(a == b);    // Reference comparison
		System.out.println(a.equals(b)); // Content comparison
		
							
							/*   Case 2: output
							 
								 a == b: false
								 a.equals(b): true
						
					
							 */
		System.out.println("-----------------------------------");
		
		
		
		
		// Case 3: Using new Integer()
		System.out.println("Case 3: Using new Integer()");
		
		Integer m = new Integer(100);
		Integer n = new Integer(100);
		

		System.out.println(m == n);    // Reference comparison
		System.out.println(m.equals(n)); // Content comparison

							/* Case 3: Output
							
								m == n: false
								m.equals(n): true
							
							*/
		System.out.println("-----------------------------------");
		
		
		
		
		
		
		// Case 4: Autoboxing of Primitives
		System.out.println("Case 4: Autoboxing of Primitives");
		
		int p = 100;
		Integer q = 100;
		
		System.out.println(p == q);    // Reference comparison
		System.out.println(q.equals(p)); // Content comparison

							/* Case 4: Output
							
								p == q: true
								q.equals(p): true
							
							*/
		System.out.println("-----------------------------------");
 
		
		
		
		// Case 5: Comparing null values
		System.out.println("Case 5: Comparing null values");
		
		Integer i = null;
		Integer j = null;
		
		System.out.println(i==j);
		System.out.println(i.equals(j));  //  NullPointerException
		
		
		
		System.out.println("");
		

	}

}



/*
 
 
 
 
 
In Java, when you compare two Integer objects using ==, it compares their reference (memory location), not their actual content (value). If you compare two Integer objects with the same value but different references, the result will depend on how the Integer objects are created.

Example:
Integer a = 250;
Integer b = 250;

System.out.println(a == b);    // Reference comparison
System.out.println(a.equals(b)); // Content comparison

Output:
false
true

Explanation:

1) Reference Comparison (==):

When you compare a == b, it checks whether both a and b refer to the same object in memory.

In Java, Integer objects between -128 and 127 are cached and reused (known as Integer caching). 
This means that if you assign a value in this range, Java will reuse the same Integer object from the cache, and a == b would return true.

However, for values outside this range (like 250), new Integer objects are created for each assignment, 
meaning a and b will be different objects in memory, so a == b will return false.




2) Content Comparison (a.equals(b)):

The equals() method checks the actual content (value) of the Integer objects, not their references.
Since a and b both have the value 250, a.equals(b) will return true regardless of whether they refer to the same object.

Summary:

a == b: Compares references. For values outside the range of -128 to 127, it will return false because new objects are created.
a.equals(b): Compares content (value). This will return true because both a and b have the value 250.












Integer objects in Java, you need to understand two concepts: reference comparison (using ==) and content comparison (using equals()), 
as well as how integer caching works.

1. Reference Comparison (==)

When you use ==, you are checking whether two references point to the same memory location, not whether their values are the same.

2. Content Comparison (equals())

When you use equals(), Java checks whether the values of the two objects are the same, regardless of their memory locations.


Integer Caching:

Java uses an Integer cache for Integer values between -128 and 127 (inclusive). 
If you create Integer objects within this range using autoboxing or Integer.valueOf(), the same object is returned from the cache. 
For values outside this range, new Integer objects are created, meaning different references are used.







--------------------------------------------------------------------------------------------------------------

Case 1: Values between -128 and 127
 
Integer x = 100;
Integer y = 100; 

Reference comparison (==):

Since 100 is within the range of -128 to 127, both x and y will refer to the same cached object.
x == y will return true because both references point to the same object in memory.

Content comparison (equals()):

x.equals(y) will return true because the values of x and y are equal (100).

--------------------------------------------------------------------------------------------------------------

Case 2: Values outside -128 to 127
 
Integer a = 250;
Integer b = 250;

Reference comparison (==):

Since 250 is outside the range of -128 to 127, new Integer objects are created for both a and b. As a result, a and b refer to different objects in memory.
a == b will return false because they are not the same object.

Content comparison (equals()):

a.equals(b) will return true because the values of a and b are both 250, even though they are different objects.

Output:
a == b: false
a.equals(b): true

--------------------------------------------------------------------------------------------------------------

Case 3: Using new Integer()
 
Integer m = new Integer(100);
Integer n = new Integer(100);

Reference comparison (==):

When you explicitly use the new Integer() constructor, new objects are always created, even for values within the caching range (-128 to 127). As a result, m and n will refer to different objects.
m == n will return false because they are different objects in memory.

Content comparison (equals()):

m.equals(n) will return true because the values of m and n are both 100, even though they are different objects.
Output:
 
m == n: false
m.equals(n): true
--------------------------------------------------------------------------------------------------------------


Case 4: Autoboxing of Primitives

int p = 100;
Integer q = 100;

Reference comparison (==):

In this case, p is a primitive int, and q is an Integer object. Java automatically autoboxes the primitive int into an Integer when comparing. It compares the value directly, not the reference.
p == q will return true because the value 100 is the same, even though one is a primitive and the other is an object.

Content comparison (equals()):

q.equals(p) will also return true because the equals() method compares the values, and both p and q represent 100.

Output:

p == q: true
q.equals(p): true

--------------------------------------------------------------------------------------------------------------

Case 5: Comparing null values

Integer i = null;
Integer j = null;

Reference comparison (==):

When both i and j are null, i == j will return true because both are null, and they do not reference any objects.
Content comparison (equals()):

If you call i.equals(j), you will get a NullPointerException because i is null, and calling a method on null throws an exception.Output:

i == j: true
i.equals(j): NullPointerException

--------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------

Summary of Results:

Case									== (Reference Comparison)			equals() (Content Comparison)
Within ( -128 to 127 )							true							true
Outside ( -128 to 127 )							false							true
Using ( new Integer() )							false							true
Primitive and Autoboxed Integer					true							true
Comparing null values							true							NullPointerException

In short:

Reference comparison (==) works for cached integers (-128 to 127), 
but for other values or explicitly created objects, it compares memory addresses and often returns false.

Content comparison (equals()) always compares values and returns true as long as the values are the same.



--------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------




*/