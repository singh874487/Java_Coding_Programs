package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2_Group_Keys_Based_On_Hashmap_Values_2 {

	public static void main(String[] args) {
		 
		// Step 1: Create a list of Server objects
        List<Server> servers = Arrays.asList(
            new Server("Server 1", 5),
            new Server("Server 2", 4),
            new Server("Server 3", 5),
            new Server("Server 4", 6),
            new Server("Server 5", 2),
            new Server("Server 6", 4)
        );

        // Step 2: Create a HashMap to group servers by their return value
        Map<Integer, List<Server>> serverMap = new HashMap<>();

        for (Server server : servers) {
            // If the return value key is not present, create a new list
            serverMap.putIfAbsent(server.returnValue, new ArrayList<>());
            // Add the server to the list corresponding to its return value
            serverMap.get(server.returnValue).add(server);
        }

        // Step 3: Print the groups of servers with the same return value
        for (Map.Entry<Integer, List<Server>> entry : serverMap.entrySet()) {
            Integer returnValue = entry.getKey();
            List<Server> serverList = entry.getValue();
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