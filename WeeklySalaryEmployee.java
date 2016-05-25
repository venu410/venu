package org.cap.demo;

import java.util.Scanner;

public class WeeklySalaryEmployee extends Employee{
	
	public WeeklySalaryEmployee(){}
	
	public WeeklySalaryEmployee(int empId, String firstName, String lastName) {
		super(empId, firstName, lastName);
		
	}

	private float no_of_hours;
	private float wages_per_hour;

	@Override
	double calculateSalary() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Hours:");
		no_of_hours=sc.nextFloat();
		
		System.out.println("Enter wages_per_hour:");
		wages_per_hour=sc.nextFloat();
		
		
		return no_of_hours*wages_per_hour;
	}

}
