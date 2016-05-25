package org.cap.demo;

public class MultiplyTable{
	
	/*private int num;
	
	public MultiplyTable(int  num){
		this.num=num;
	}
	*/
	
	
	 public static void printTable(int num){
		
		System.out.println(Thread.currentThread().getName() +"-->"+"Table --> Started");
		
		synchronized(MultiplyTable.class){
		for (int i=1;i<=15;i++)
			System.out.println(  i+"*"+num+"="+(i*num));
		}
		System.out.println(Thread.currentThread().getName() +"-->"+"Table --> Completed");
	}
	
	

}
