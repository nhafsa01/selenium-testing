package com.ayantsoft.test.dao.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ayantsoft.test.dao.EmployeeDao;
import com.ayantsoft.test.pojo.Employee;

public class EmployeeDaoTest {
	
	private EmployeeDao empdao;
	//prepare for the test 
	@Before
	public void setup() {
		empdao = new EmployeeDao();
	}
     
	@Test
	public void saveTest() {
		//we are calling Employee class by creating an object emp1 and set variable data through object emp1
		Employee emp1 = new Employee();
		emp1.setAge(56);
		emp1.setEmail("someone@gmail.com");
		emp1.setName("harry");
		emp1.setSalary(1000.00);
		empdao.save(emp1);
		
		// we are getting same value through empdao and store value in emp2
		Employee emp2 = empdao.findByEmial("someone@gmail.com");
		assertNotNull("Employee object is not null",emp2);
		assertEquals("Salary is not equal",emp1.getSalary(),emp2.getSalary(),1.00);
		assertEquals("Age is not equal",emp1.getAge(),emp2.getAge());
		assertEquals("Name is not equal",emp1.getName(),emp2.getName());
		assertEquals("Email is not equal",emp1.getEmail(),emp2.getEmail());
		
	}
	
	
	@Test
	public void updateTest(Employee e) {
			
		Employee a = empdao.findByEmial("someone@email.com");
		a.setAge(56);
		empdao.update(a);
		
		Employee b = empdao.findByEmial("someone@email.com");
		assertEquals("Age is not equals",56,b.getAge());
	}
	
	@Test
	public void findByEmialTest() {
		
		Employee abc = empdao.findByEmial("someone@gmail.com");
		//if employee is null test fails
		assertNotNull("employee is null",abc);
	}
	
	@Test
	public void findAllTest() {
		List<Employee> employees = empdao.findAll();
		assertNotNull("emploee is null",employees);
		assertEquals("List is empty",false,employees.isEmpty());
	}
	
	@Test
	public void deleteTest() {
		empdao.delete("someone@gmail.com");
		Employee abc = empdao.findByEmial("someone@gmail.com");
		assertNull("employee is null",abc);
	}
   
	//anything you want to deallocate or close the resources
	@After
	public void close() {
		empdao = null;
	}
	
	
	
}
