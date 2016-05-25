package org.capgemini.demo;

import java.util.Scanner;

public class TestClass_Assertions {

	public static void main(String[] args) {
		
		int age;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age:");
		age=sc.nextInt();
		
		
		assert age>=18:"Age should be greater than 18!";
		
		System.out.println("Eligible for vote");
		

	}

}
