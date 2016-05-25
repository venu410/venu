package org.capgemini.demo;

public class Demo_Exception {
	
	
	
	public void calculate()throws ArithmeticException{
		int num1=100,num2=0;
		if(num2==0)
			throw new ArithmeticException("Error! number 2 become zero now!");
		int ans=num1/num2;
		System.out.println("Answer :" + ans) ;
	}

}
