package com.greatlearning.departments;

import com.greatlearning.model.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	public void departmentName()
	{
		System.out.println("\nWelcome to HR Department ");
	}
	
	public void getTodaysWork()
	{
		System.out.println("Fill today’s timesheet and mark your attendance");
	}
	
	public void getWorkDeadline()
	{
		System.out.println("Complete by EOD ");
		isTodayAHoliday();
	}
	
	public void doActivity()
	{
		System.out.println("team Lunch");
	}
	
}

