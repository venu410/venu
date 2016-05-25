package org.cap.demo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Write_Object_demo {

	public static void main(String[] args) {
		
		
		
		File file=new File("D:\\vidavid\\Training\\2016\\Trained_FLP_Chennai_2_May_2016_to_30_June_2016\\Trained_FLP\\Demo\\class_Room_Demo\\Day-May-13\\src\\main\\resources\\employee.dat");
		
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		UserInteraction ui=new UserInteraction();
		String choice=null;
		Scanner sc=new Scanner(System.in);
		
		try{
			fout=new FileOutputStream(file);
			out=new ObjectOutputStream(fout);
			
			do{
			Employee employee=ui.getEmployee();
			out.writeObject(employee);
			System.out.println("Wish to contine?[y|n]");
			choice=sc.next();
			}while(choice.charAt(0)=='Y'||choice.charAt(0)=='y');
			
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
		
		FileInputStream fin=null;
		ObjectInputStream oin=null;
		
		try{
			fin=new FileInputStream(file);
			oin=new ObjectInputStream(fin);
			Employee emp=null;
			do{
			emp=(Employee)oin.readObject();
			System.out.println(emp);
			}while(emp!=null);
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch (EOFException e) {
			
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}finally{
			try {
				oin.close();
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
