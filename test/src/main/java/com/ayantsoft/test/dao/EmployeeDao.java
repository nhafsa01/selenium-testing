package com.ayantsoft.test.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ayantsoft.test.pojo.Employee;

public class EmployeeDao {

    //and here i am going to take a hashmap
	//HashMap is a part of Java’s collection since Java 1.2. It provides the basic implementation of Map interface of Java. It stores the data in (Key, Value) pairs. To access a value one must know its key. 
    //It contains “key-value” pairs and allows retrieving value by key. 
	//Map myhash = Collections.synchronizedMap(hashMap)
	//In java we have collection framework
	//hash map is the part of it
	// thsi empdb object is the data type of hashmap
	private static HashMap<String,Employee> empdb = new HashMap<String,Employee>();
	
	//demo db is created and is accessed by object empdb
	//created a method save that will get emial from db through employee variable and save email field in Employee database.
	
	public void save(Employee employee) {
		//we are storing the Employee object(employee) using the Email of employee using as key and store that in empdb object into database.
		empdb.put(employee.getEmail(), employee);
	}
	
	public void update(Employee employee) {
		empdb.put(employee.getEmail(), employee);
	}
	
	/*public void findByEmial(String email) {
		empdb.get(email);
	}*/
	
	//now we change the void into return because data come from db
	public Employee findByEmial(String email) {
		return empdb.get(email);
	}
	
	
	public List<Employee> findAll() {
		return new ArrayList<Employee>(empdb.values());
	}
	
	public void delete(String email) {
		empdb.remove(email);
	}
}
