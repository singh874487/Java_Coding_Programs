package com.example.one;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Input
        List<Department> departments = Arrays.asList(
                new Department("Sales", Arrays.asList(
                        new Employee5("John", 30, "New York"),
                        new Employee5("Alice", 35, "New York"),
                        new Employee5("Bob", 45, "Chicago")
                )),
                new Department("Marketing", Arrays.asList(
                        new Employee5("Mike", 25, "Chicago"),
                        new Employee5("Emma", 38, "New York"),
                        new Employee5("David", 42, "Chicago")
                ))
        );

        // Output
        Map<String, List<Employee5>> result = departments.stream()
                .flatMap(d -> d.employee.stream())
                .filter(e -> e.age < 40)
                .collect(Collectors.groupingBy(Employee5::city));

        System.out.println(result);
    }
}

class Employee5 {
    String name;
    int age;
    String city;

    public Employee5(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String city() {
        return city;
    }

	@Override
	public String toString() {
		return "Employee5 [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
}

class Department {
    String name;
    List<Employee5> employee;

    public Department(String name, List<Employee5> employee) {
        this.name = name;
        this.employee = employee;
    }
}
