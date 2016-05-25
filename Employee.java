package org.capgemini.demo;

import java.util.Scanner;

public class Employee {
	
	//instance varibles
	private String empName;
	private double salary;
	
	static String compyName="Capgemini India Pvt Ltd!";
	
	
	//get inputs from user
	public void getEmployeeDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		empName=sc.next();
		
		System.out.println("Enter Employee Salary:");
		salary=sc.nextDouble();
		
	}
	
	//calculate bonus based on the salary
	public double calculateBonus(){
		
		//local variable
		double bonus=0.0;
		if(salary>2000000)
			bonus=salary*.15;
		else if(salary>1000000)
			bonus=salary*0.20;
		else if(salary>500000)
			bonus=salary*0.25;
		else
			bonus=salary*0.30;
		
		return bonus;
	}
	
	
	public void showEmployeeDetails(){
		System.out.println("\n\nName :" + empName);
		System.out.println("Salary:" + salary +
				"\nBonus:" + calculateBonus());
	}

}









