package com.greatlearning.departments;

import com.greatlearning.model.SuperDepartment;

public class TechDepartment extends SuperDepartment {
	public void departmentName()
	{
		System.out.println("\nWelcome to Tech Department ");
	}
	
	public void getTodaysWork()
	{
		System.out.println("Complete coding of module 1");
	}
	
	public void getWorkDeadline()
	{
		System.out.println("Complete by EOD ");
	}
	
	public void getTechStackInformation()
	{
		System.out.println("Core Java");
		isTodayAHoliday();
	}

}
