package org.capgemini.demo;

public class MainClass_Test {
	
	public static int sumInt(int ... nums){
	
		int sum=0;
		for(int num:nums)
			sum+= num;
		
		return sum;
	}
	
	public static int sumInt(String name,int[]...nums){
		System.out.println("Name:" + name);
		int sum=0;
		for(int num:nums[0])
			sum+= num;
		
		return sum;
	}

	public static void main(String[] args) {
		int[] mynums={1,2,3,4,5,5,5};
		
		System.out.println("Sum:" + sumInt(12,34,566));
		System.out.println("Sum:" + sumInt("Tom",mynums));
		System.out.println("Sum:" + sumInt(12));

	}

}
