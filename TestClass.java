package org.capgemini.demo;



public class TestClass {

	public static void main(String[] args) {
		
		
		if(args.length>0)
		{
			System.out.println("Total no of Args:" + args.length);
			
			for(String str:args)
				System.out.println(str);
		}
		
		
		StaticDemo demo=new StaticDemo();
		
		StaticDemo demo1=new StaticDemo();
		
		
		demo.show();
		
		StaticDemo.show();
		
		/*try {
			Class.forName("org.capgemini.demo.StaticDemo");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
