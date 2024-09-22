package com.arjun.java.java8.flatmap;

/*
 
4. Working with Complex Objects

Consider we have a list of Student objects, each of which has a list of Course objects. 
we want to create a list of all courses taken by all students.

*/


import java.util.*;
import java.util.stream.Collectors;

class Course {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }
}

public class FlatMapExample_4 {
    public static void main(String[] args) {
    	
        // Create a list of students
        List<Student> students = Arrays.asList(
            new Student("John", Arrays.asList(new Course("Math"), new Course("Physics"))),
            new Student("Jane", Arrays.asList(new Course("Biology"), new Course("Chemistry"))),
            new Student("Doe", Arrays.asList(new Course("History"), new Course("Geography")))
        );

        // Flatten the list of courses from all students
        List<String> allCourses = students.stream()
            .flatMap(student -> student.getCourses().stream())
            .map(Course::getName)
            .collect(Collectors.toList());

        // Print the list of all courses
        System.out.println(allCourses);
    }
}


/*


Output:
 
[Math, Physics, Biology, Chemistry, History, Geography]


Explanation:

students.stream() creates a stream of Student objects.
flatMap(student -> student.getCourses().stream()) flattens the stream of course lists into a single stream of Course objects.
map(Course::getName) extracts the name of each course.
The result is a list of all course names.



*/