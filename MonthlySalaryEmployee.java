package org.cap.demo;

import java.util.Scanner;

public class MonthlySalaryEmployee extends Employee{
	
	
	

	private float no_of_days;
	private float sal_per_day;

	
public MonthlySalaryEmployee(){}
	
	public MonthlySalaryEmployee(int empId, String firstName, String lastName) {
		super(empId, firstName, lastName);
		
	}
	
	public MonthlySalaryEmployee(int empId, String firstName, String lastName,float no_of_days,
			float sal_per_day) {
		//System.out.println("Constructor Overloaded");
		this(empId, firstName, lastName);
		this.no_of_days=no_of_days;
		this.sal_per_day=sal_per_day;
		
	}
	
	@Override
	double calculateSalary() {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Days:");
		no_of_days=sc.nextFloat();
		
		System.out.println("Enter Salary per Day:");
		sal_per_day=sc.nextFloat();*/
		
		
		return no_of_days*sal_per_day;
	}

}
