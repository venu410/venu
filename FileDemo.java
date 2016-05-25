package org.cap.demo;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		
		//File file=new File("D:\\vidavid\\Training\\2016\\Trained_FLP_Chennai_2_May_2016_to_30_June_2016\\Trained_FLP\\Demo\\class_Room_Demo\\Day-May-12\\src\\main\\resources\\sample.txt");
		File file=new File("D:\\vidavid\\fileINfo\\student_info.txt");
		if(file.isFile()){
			System.out.println("Its File !");
			System.out.println("Size:" + file.length() + " bytes");
			System.out.println("Is Readable:" + file.canRead());
			System.out.println("Is Writable:" + file.canWrite());
			System.out.println("Is Executable:" + file.canExecute());
			
			System.out.println("Path :" + file.getAbsolutePath());
			
		}else if(file.isDirectory()){
			System.out.println("Its Directory !");
			String[] filenames=file.list();
			System.out.println("Sub Dir and File Names:");
			for(String fname:filenames)
				System.out.println(fname);
			
		}else{
			System.out.print("File not exits, Please create a File!");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		File file2=new File("D:\\vidavid\\fileINfo\\employee_info.txt");
		
		file.renameTo(file2);
		
		//file.de

	}

}
