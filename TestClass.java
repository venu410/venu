package org.cap.demo;

public class TestClass {

	public static void main(String[] args) {
		
		
		MyThreadRunnable runnable=new MyThreadRunnable();
		
		Thread t1=new Thread(runnable,"first");
		Thread t2=new Thread(runnable,"second");
		
		t1.start();
		t2.start();

	}

}
