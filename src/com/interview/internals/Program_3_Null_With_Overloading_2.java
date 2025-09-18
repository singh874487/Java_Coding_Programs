package com.interview.internals;

public class Program_3_Null_With_Overloading_2 {

	public static void main(String[] args) {

	//	someMethod(null);   // this will Ambiguity Scenario
		
		someMethod((Integer) null); // Explicitly calls someMethod(Integer s)
		
		someMethod((Double) null); // Explicitly calls someMethod(Double s)
	}

	
	
	public static void someMethod(Integer i) {
	    System.out.println("Integer method Invoked");
	}

	public static void someMethod(Double d) {
	    System.out.println("Double method Invoked");
	}

}


 


/*
 

Additional Insights:

Ambiguity Scenario:

If there were two methods where neither was more specific than the other, passing null would lead to a compilation error due to ambiguity.
Example:
 
Calling someMethod(null); in this scenario would cause a compile-time error because Java cannot determine whether to invoke someMethod(Integer i) 
or someMethod(Double d).


Best Practices:

To avoid such ambiguities, it's advisable to design overloaded methods carefully, ensuring that there's a clear hierarchy of specificity.
When in doubt, you can explicitly cast null to the desired type to guide the compiler.
 
someMethod((Integer) null); // Explicitly calls someMethod(String s)



*/