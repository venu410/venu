package org.capgemini.demo;

public class InvalidAgeException extends Throwable{
	
	public InvalidAgeException(){
		super("Error! Age should be greater than 18!");
	}
	
	public InvalidAgeException(String msg){
		super(msg);
	}

	
	

}
