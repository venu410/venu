package org.cap.demo;

public class MainClassTest {

	public static void main(String[] args) {
		/*
		MultiplyTable t1=new MultiplyTable(5);
		MultiplyTable t2=new MultiplyTable(12);
		MultiplyTable t3=new MultiplyTable(23);
		
		
		t1.start();
		t2.start();
		t3.start();*/
		
		
		
		
		
		
		//final MultiplyTable obj=new MultiplyTable();
		
		Thread t1=new Thread(){
			
			public void run(){
				MultiplyTable.printTable(12);
			}
		};
		
		Thread t2=new Thread(){
			
			public void run(){
				MultiplyTable.printTable(5);
			}
		};
		
		
		
		Thread t3=new Thread(){
			
			public void run(){
				MultiplyTable.printTable(15);
			}
		};
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
		

	}

}
