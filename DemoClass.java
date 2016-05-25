package org.cap.demo;

public class DemoClass {

	public static void main(String[] args) {
		
		Runnable runnable=new Runnable() {
			
			public void run() {
				for(int i=0;i<15;i++)
					System.out.println( Thread.currentThread().getName()+"-->"+ i+"*15="+(i*15));
			
				
			}
		};
		
		Runnable runnable1=new Runnable() {
			
			public void run() {
				for(int i=0;i<15;i++)
					System.out.println("Capgemini");
				
			}
		};
		

		Thread t1=new Thread(runnable);
		t1.start();
		
		Thread t2=new Thread(runnable1);
		t2.start();
		
	}

}
