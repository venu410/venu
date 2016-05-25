package org.capgemini.demo;

import java.util.Scanner;

public class Demo {
	
	
	private double prin=10000;
	private float years=5;
	private float rate=7.5f;
	
	public double calculateIntrest(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter prin:");
		double prin=sc.nextDouble();
		System.out.println("Enter Years:");
		float year=sc.nextFloat();
		System.out.println("Enter Intrest Rate:");
		float rate=sc.nextFloat();
		
		double simplein=prin*year*rate;
		
		return simplein;
		
	}
	
	public double calculateIntrest(double prin){
		return prin*this.years*this.rate;
		
	}
	
	public double calculateIntrest(double prin,float years){
		System.out.println("Simple interest with 2args" );
		return prin*years*this.rate;
	}
	
	public double calculateIntrest(double prin, float years, float rate){
		return prin*years*rate;
	}

}
