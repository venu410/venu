package org.capgemini.demo;

public class StaticDemo {
	
	int num=500;
	
	//static variable
	public static int count=100;
	
	
	//static block
	static{
		System.out.println("Static Block");
		System.out.println("Static Variable:"+count);
	}

	
	
	{
		System.out.println("Normal Block");
	}
	
	public StaticDemo(){
		System.out.println("No Arg Constructor");
	}
	
	
	public static void show(){
		
		int num=500;
		
		System.out.println("Show Method");
		System.out.println("Count :" + count);
		
		System.out.println("Number :" + num);
	}
	
	public void non_Static_method(){
		System.out.println("non_Static_method");
	}
	
	
}














