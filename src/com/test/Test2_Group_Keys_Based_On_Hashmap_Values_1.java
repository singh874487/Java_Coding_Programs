package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2_Group_Keys_Based_On_Hashmap_Values_1 {

	public static void main(String[] args) {
		 

		// Step 1: Initialize the data
        Map<Integer, List<String>> serverMap = new HashMap<>();
        
        // Server return values
        String[] servers = {"Server 1", "Server 2", "Server 3", "Server 4", "Server 5", "Server 6"};
        int[] returnValues = {5, 4, 5, 6, 2, 4};
        
        // Step 2: Populate the HashMap
        for (int i = 0; i < servers.length; i++) {
            int returnValue = returnValues[i];
            String server = servers[i];
            
            // Add server to the appropriate list in the HashMap
            serverMap.putIfAbsent(returnValue, new ArrayList<>());
            serverMap.get(returnValue).add(server);
        }
        
        // Step 3: Print the groups of servers with the same return value
        for (Map.Entry<Integer, List<String>> entry : serverMap.entrySet()) {
            Integer returnValue = entry.getKey();
            List<String> serverList = entry.getValue();
            
            // Print the return value and the list of servers
            System.out.println("Servers returning " + returnValue + ": " + serverList);
        }
		
		
		
	}

}






















/*


Write a Java program to print the set of servers having the same return value using a hashmap. 
Use the data below as your input to the program.
You are welcome to structure the input in any way you choose.

Server 1 returns 5
Server 2 returns 4
Server 3 returns 5
Server 4 returns 6
Server 5 returns 2
Server 6 returns 4




*/