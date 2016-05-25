package org.capgemini.demo;

public class MainClass1 {

	public static void main(String[] args) {
		Demo demo=new Demo();
		double sin;
		sin=demo.calculateIntrest();
		System.out.println("Simple interest:" + sin);
		sin=demo.calculateIntrest(5000, 3);
		System.out.println("Simple interest:" + sin);
	}

}
