package org.cap.demo;

public class MyThreadRunnable implements Runnable {

	public void run() {
		for(int i=0;i<15;i++)
			System.out.println( Thread.currentThread().getName()+"-->"+ i+"*15="+(i*15));
		
	}

}
