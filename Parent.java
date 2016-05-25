package org.capgemini.demo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Parent {
	
	public void showAnswer() throws FileNotFoundException,IOException{
		Integer num1=null;
		int num2=45;
		
		int ans=num1+num2;
		System.out.println("Answer:" + ans);
	}

}
