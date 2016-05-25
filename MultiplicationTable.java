package org.cap.demo;

public class MultiplicationTable extends Thread{
	
	private int num;
	
	public MultiplicationTable(int num) {
				this.num=num;
	}
	
	public MultiplicationTable(int num,ThreadGroup tg) {
		super(tg, "TrainedFLP");
		this.num=num;
	}
	
	@Override
	public void run(){
		
		//System.out.println("My Priority:" + Thread.currentThread().getPriority());
		//Thread.yield()
		
		for(int i=1;i<=15;i++)
		{
			System.out.println( currentThread().getName() +"-->"+ i+"*"+num+"="+(i*num));
			/*try {
				Thread.sleep(1000);;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
		}
	}

}
