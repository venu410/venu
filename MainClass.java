package org.cap.demo.threaddemo;

public class MainClass {

	public static void main(String[] args) {
		
		final Product product=new Product();
		
		Thread t1=new Thread(){
			@Override
			public void run(){
				product.consumeProduct(5);
			}
		};
		
		Thread t2=new Thread(){
			@Override
			public void run(){
				product.produceProduct(10);
			}
		};
		
		Thread t3=new Thread(){
			@Override
			public void run(){
				product.consumeProduct(7);
			}
		};
		
		Thread t4=new Thread(){
			@Override
			public void run(){
				product.consumeProduct(10);
			}
		};
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
