package com.interview.asked;
import java.util.*;
import java.util.stream.Collectors;

// Filter a list of employees whose names start with 'P', sort them alphabetically by name.

public class Program_13_Employee_Filter_Sort_Example {
	
    public static void main(String[] args) {
    	
        // Sample list of employees
        List<Employee> list = Arrays.asList(
                new Employee("John", 30),
                new Employee("Paul", 25),
                new Employee("Peter", 35),
                new Employee("Alex", 40)
        );

        // Filtering and sorting employees whose names start with 'P'
        List<Employee> filteredList = list.stream()
                .filter(a -> a.getName().startsWith("P"))
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        // Printing the filtered and sorted list
        filteredList.forEach(System.out::println);
    }
}



class Employee {
    private String name;
    private int age;

    // Constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // toString method to display employee information
    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
















