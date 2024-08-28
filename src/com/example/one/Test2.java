package com.example.one;

public class Test2 {

	 
	
	public static void main(String[] args) {
	    Dog aDog = new Dog("Max");
	    Dog oldDog = aDog;

	    // we pass the object to foo
	    foo(aDog);
	    // aDog variable is still pointing to the "Max" dog when foo(...) returns
	    
	    System.out.println("aDog.getName().equals(\"Max\")"+aDog.getName().equals("Max"));
	    System.out.println("aDog.getName().equals(\"Fifi\")"+aDog.getName().equals("Fifi"));
	    System.out.println(" aDog == oldDog"+ (aDog == oldDog));
	     
	}

	public static void foo(Dog d) {
	    d.getName().equals("Max"); // true
	    // change d inside of foo() to point to a new Dog instance construct red with name member variable set to "Fifi"
	    d = new Dog("Fifi");
	    d.getName().equals("Fifi"); // true
	}

}


class Dog{
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	Dog(String name){
		this.name=name;
	}
}
