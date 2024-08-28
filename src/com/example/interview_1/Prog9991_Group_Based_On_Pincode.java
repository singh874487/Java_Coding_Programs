package com.example.interview_1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class Prog9991_Group_Based_On_Pincode {

	public static void main(String[] args) {
  
		List<Employee> employees = List.of(new Employee(1,new Address("12345")), 
										   new Employee(2,new Address("67890")),
										   new Employee(3,new Address("12345")), 
										   new Employee(4,new Address("12345")));

		Map<String, List<Employee>> map = employees.stream()
									                .collect(Collectors.groupingBy(
									                        employee -> employee.getAddress().getPincode()
									                ));
		
		map.forEach((pincode, employeeList) -> {
			System.out.println("Pincode: " + pincode);
			employeeList.forEach(System.out::println);
		});

	}
}
	

class Employee {
	int id;	
	Address address;

	public Employee(int id, Address address) {		 
		this.id = id;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + ", getId()=" + getId() + ", getAddress()=" + getAddress()
				+ "]";
	}
 }

class Address {
	String pincode;

	public Address(String pincode) {
		this.pincode = pincode;
	}
	public String getPincode() {
		return pincode;
	}
}
 