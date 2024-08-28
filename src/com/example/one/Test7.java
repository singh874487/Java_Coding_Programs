package com.example.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test7 {

	public static void main(String[] args) {
		
		List<Department> list = new ArrayList<Department>();


	  list.stream()
				.map(x-> x.getEmployee())
			.filter(b->b.getAge()<40)
			
			.collect(Collectors.groupingBy(a->a.getCity()));




	}

}





class Employee2{
String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
int age;
String city;
}

class Department{
String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Employee> getEmployee() {
	return employee;
}
public void setEmployee(List<Employee> employee) {
	this.employee = employee;
}
List<Employee> employee;
}
 
 
