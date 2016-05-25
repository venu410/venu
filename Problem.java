package org.cap.demo;

public class Problem {

	public static void main(String[] args) {
		
		
		final String s1="Tom";

		final String s2="Jerry";
		
		
		Thread t1=new Thread(){
			@Override
			public void run(){
				synchronized (s1) {
					System.out.println("s1 object locked by Thread 1");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					synchronized (s2) {
						System.out.println("s2 object locked by Thread 1");
					}
					
				}
				
			}
			
		};
		
		Thread t2=new Thread(){
			@Override
			public void run(){
				synchronized (s2) {
					System.out.println("s2 object locked by Thread 2");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					synchronized (s1) {
						System.out.println("s1 object locked by Thread 2");
					}
					
				}
				
			}
			
		};
		
		t1.start();
		t2.start();
		
	}

}
