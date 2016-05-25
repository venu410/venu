package org.capgemini.demo;

import java.io.FileNotFoundException;
import java.io.IOException;


@Author(authorName="Tom",price=230000,publishDate="25-dec-2015")
public class Child extends Parent{
	
	
	@Author(authorName="Tom",price=230000,publishDate="25-dec-2015")
	@Override
	public void showAnswer()throws ArithmeticException,FileNotFoundException,IOException{
		System.out.println("Child Class Override Method");
		int num1=100,num2=0;
		
		int ans=num1/num2;
		System.out.println("Answer :" + ans) ;
	}

}
