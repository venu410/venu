package org.cap.demo;

public class MyThread extends Thread{
	
	public  MyThread(String threadName) {
		super(threadName);
	}
	
	
	@Override
	public void run(){
		System.out.println("Thread Started");
		for(int i=0;i<100;i++)
			System.out.println(currentThread().getName()+"--->"+ i);
	}

}
