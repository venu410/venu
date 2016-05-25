package org.cap.demo;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Format_Output_Demo {

	public static void main(String[] args) {
		
		int empId=1001;
		String empName="Tom";
		double salary=23000;
		char gender='M';
		boolean isPermanent=true;
		
		
		File file=new File("D:\\vidavid\\Training\\2016\\Trained_FLP_Chennai_2_May_2016_to_30_June_2016\\Trained_FLP\\Demo\\class_Room_Demo\\Day-May-12\\src\\main\\resources\\employee_info.txt");
		
		FileOutputStream fout=null;
		DataOutputStream dout=null;
		try {
			fout=new FileOutputStream(file);
			dout=new DataOutputStream(fout);
			
			
			dout.writeInt(empId);
			dout.writeDouble(salary);
			dout.writeChar(gender);
			dout.writeBoolean(isPermanent);
			dout.write(empName.getBytes());
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
			dout.close();
			fout.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		
		FileInputStream fin=null;
		DataInputStream din=null;
		
		try {
			fin=new FileInputStream(file);
			din=new DataInputStream(fin);
			
			int eid=din.readInt();
			double sal=din.readDouble();
			char ch=din.readChar();
			boolean status=din.readBoolean();
			String ename=din.readLine();
			
			System.out.println("Name :" + ename +
					"\nEmp Id:" + eid+
					"\nSalary:" + sal+
					"\nGender:" + ch+
					"\nIs a Permanent:" + status);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				din.close();
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
