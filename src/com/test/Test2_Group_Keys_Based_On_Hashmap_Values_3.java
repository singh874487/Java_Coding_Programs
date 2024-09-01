package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2_Group_Keys_Based_On_Hashmap_Values_3 {

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

        // Group servers by their return value using Streams
        Map<Integer, List<Server>> serverMap = servers.stream()
            .collect(Collectors.groupingBy(Server::getReturnValue));

        // Print the groups of servers with the same return value
        serverMap.forEach((returnValue, serverList) ->
            System.out.println("Servers returning " + returnValue + ": " + serverList)
        );
        
 
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