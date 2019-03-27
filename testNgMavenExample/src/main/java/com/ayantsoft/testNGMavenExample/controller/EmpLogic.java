package com.ayantsoft.testNGMavenExample.controller;

import com.ayantsoft.testNGMavenExample.pojo.Emp;

public class EmpLogic {
	 // Calculate the yearly salary of employee
	   public double calculateYearlySalary(Emp employeeDetails) {
	      double yearlySalary = 0;
	      yearlySalary = employeeDetails.getMonthlySalary() * 12;
	      return yearlySalary;
	   }
		
	   // Calculate the appraisal amount of employee
	   public double calculateAppraisal(Emp employeeDetails) {
	   
	      double appraisal = 0;
	      
	      if(employeeDetails.getMonthlySalary() < 10000) {
	         appraisal = 500;
	         
	      } else {
	         appraisal = 1000;
	      }
	      
	      return appraisal;
	   }
	   
	   public void methodExceptionThrowing() {
		   		int var1,var2,var3;
		   		var1=12;var2=0;
		   		var3=var1/var2;
		   }
	   
	   
	}

