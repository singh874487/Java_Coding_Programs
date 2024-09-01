package com.test;

public class Server {
	
	 String name;
	    int returnValue;

	    Server(String name, int returnValue) {
	        this.name = name;
	        this.returnValue = returnValue;
	    }

	    public int getReturnValue() {
	        return returnValue;
	    }

	    @Override
	    public String toString() {
	        return name;
	    }

}
