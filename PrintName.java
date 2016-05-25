package org.cap.demo;

public class PrintName extends Thread{
	
	private String myName;
	
	public PrintName(String myName){
		this.myName=myName;
	}

	@Override
	public void run(){
		for(int i=0;i<myName.length();i++)
			System.out.println(myName.substring(0, i));
	}
	
}
