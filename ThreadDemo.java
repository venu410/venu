package org.cap.demo;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Thread t1=new Thread(){
			@Override
			public void run(){
				for(int i=0;i<15;i++)
					System.out.println("Capgemini");
			}
		};
		
		
		t1.start();

	}

}
