package org.cap.demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Employee_Info {

	public static void main(String[] args) {
		int empId;
		String fName;
		String lName;
		double salary;
		int count=0;
		
		File file=new File("D:\\vidavid\\Training\\2016\\Trained_FLP_Chennai_2_May_2016_to_30_June_2016\\Trained_FLP\\Demo\\class_Room_Demo\\Day-May-13\\src\\main\\resources\\employee_data.txt");
		Scanner sc=new Scanner(System.in);
		FileOutputStream fout=null;
		DataOutputStream dout=null;
		
		try{
			fout=new FileOutputStream(file);
			dout=new DataOutputStream(fout);
			
			String choice=null;
			
			do{
			System.out.println("Enter EmpId:");
			empId=sc.nextInt();
			System.out.println("Enter FirstName:");
			fName=sc.next();
			System.out.println("Enter LastName:");
			lName=sc.next();
			System.out.println("Enter Salary:");
			salary=sc.nextDouble();
			
			dout.writeInt(empId);
			dout.writeInt(fName.length());
			dout.write(fName.getBytes());
			dout.writeInt(lName.length());
			dout.write(lName.getBytes());
			dout.writeDouble(salary);
			System.out.println("Wish to contine?[y|n]");
			choice=sc.next();
			count++;
			}while(choice.charAt(0)=='Y'||choice.charAt(0)=='y');
			
			
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fout.close();
				dout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileInputStream fin=null;
		DataInputStream din=null;
		
		try{
			fin=new FileInputStream(file);
			din=new DataInputStream(fin);
			
			int eid,size;
			String firstName,lastName;
			double sal;
			byte[] b=null;
			
			
			
			while(count>0){
			eid=din.readInt();
			//firstName
			size=din.readInt();
			b=new byte[size];
			din.read(b);
			firstName=new String(b);
			//lastNAme
			size=din.readInt();
			b=new byte[size];
			din.read(b);
			lastName=new String(b);
			
			
			sal=din.readDouble();
			
			System.out.println(eid +"\t" + firstName + "\t" + lastName + "\t" +sal);
			
			count--;
			}
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
				din.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
		
	}

}
