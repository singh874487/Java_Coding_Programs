package com.example.one;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
        // Input
        List<Department2> departments = Arrays.asList(
                new Department2("Sales", Arrays.asList(
                        new Employee6("John", 30, "New York"),
                        new Employee6("Alice", 35, "New York"),
                        new Employee6("Bob", 45, "Chicago")
                )),
                new Department2("Marketing", Arrays.asList(
                        new Employee6("Mike", 25, "Chicago"),
                        new Employee6("Emma", 38, "New York"),
                        new Employee6("David", 42, "Chicago")
                ))
        );

        // Output
        Map<String, List<Employee6>> result = departments.stream()
                .flatMap(d -> d.getEmployees().stream())
                .filter(e -> e.getAge() < 40)
                .collect(Collectors.groupingBy(Employee6::getCity));

        System.out.println(result);
    }
}

class Employee6 {
    private String name;
    private int age;
    private String city;

    public Employee6(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee5 [name=" + name + ", age=" + age + ", city=" + city + "]";
    }
}

class Department2 {
    private String name;
    private List<Employee6> employees;

    public Department2(String name, List<Employee6> employees) {
        this.name = name;
        this.employees = employees;
    }

    public List<Employee6> getEmployees() {
        return employees;
    }
}
