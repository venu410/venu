package org.capgemini.demo;

public class MainClass {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.getEmployeeDetails();
		employee.showEmployeeDetails();
		
		Employee employee1=new Employee();
		
		System.out.println("Company Name:" + Employee.compyName);
		System.out.println("Company Name:" + employee1.compyName);
	}

}
