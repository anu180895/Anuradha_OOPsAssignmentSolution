package com.greatlearning.driver;

import com.greatlearning.departments.AdminDepartment;
import com.greatlearning.departments.HrDepartment;
import com.greatlearning.departments.TechDepartment;

public class MainClass {
	public static void main(String args[]) {
		
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		
		admin.departmentName();
		admin.getTodaysWork();
		admin.getWorkDeadline();
		
		hr.departmentName();
		hr.doActivity();
		hr.getTodaysWork();
		hr.getWorkDeadline();
		
		tech.departmentName();
		tech.getTodaysWork();
		tech.getWorkDeadline();
		tech.getTechStackInformation();
				
	}
}
