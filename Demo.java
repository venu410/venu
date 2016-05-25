package org.cap.demo;



public class Demo {

	public static void main(String[] args) {
		
		ThreadGroup tg1=new ThreadGroup("TrainedFLP");
		
		MultiplicationTable t1=new MultiplicationTable(5,tg1);
		MultiplicationTable t2=new MultiplicationTable(10,tg1);
		MultiplicationTable t3=new MultiplicationTable(15,tg1);
		
	
		MultiplicationTable t5=new MultiplicationTable(1);
		MultiplicationTable t6=new MultiplicationTable(2);
		MultiplicationTable t7=new MultiplicationTable(3);
		
		//t2.setPriority(18);
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		t3.start();
		
		t5.start();
		t6.start();
		t7.start();
		
		
		System.out.println("Active Threads:" + tg1.activeCount());
		System.out.println("Priority :" + tg1.getMaxPriority());
		
		
		/*
		Thread de_thread=new Thread(){
			@Override
			public void run(){
				for(int i=0;i<1000000;i++)
					System.out.println(i);
			}
		};
		
		de_thread.setDaemon(true);
		de_thread.start();*/
		
		//t3.setPriority(Thread.MAX_PRIORITY);
	
		
	//t1.start();
//	t1.start();
		
	
//		t1.run();
//		t2.run();
//		t3.run();
		
	
		/*try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		//t2.start();
		
		/*try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		//t3.start();
		
		

	}

}
