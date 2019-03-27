package com.ayantsoft.testng.maven;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ayantsoft.testNGMavenExample.controller.EmpLogic;
import com.ayantsoft.testNGMavenExample.pojo.Emp;

public class EmpTestDetails {
	
	EmpLogic empLogic=new EmpLogic();
	
	Emp employee=new Emp();
	
	
	@Test
	   public void testCalculateAppriasal() {
	   
	      employee.setName("Somnath");
	      employee.setAge(30);
	      employee.setMonthlySalary(8000);
	      
	      double appraisal = empLogic.calculateAppraisal(employee);
	      System.out.println(appraisal);
	      Assert.assertEquals(500, appraisal, 0.0, "500");
	   }
	
	@Test
	   public void testCalculateYearlySalary() {
	   
	      employee.setName("Hafsa");
	      employee.setAge(28);
	      employee.setMonthlySalary(8000);
	      
	      double salary = empLogic.calculateYearlySalary(employee);
	      Assert.assertEquals(96000, salary, 0.0, "8000");
	   }
	
	
	
}
