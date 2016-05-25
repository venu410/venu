package org.cap.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Char_output_Demo {

	public static void main(String[] args) {
		File file=new File("D:\\vidavid\\Training\\2016\\Trained_FLP_Chennai_2_May_2016_to_30_June_2016\\Trained_FLP\\Demo\\class_Room_Demo\\Day-May-12\\src\\main\\resources\\employee.txt");
	
		String str="Welcome To Capgemini!";
		
		
		
		FileWriter fwrite=null;
		
		try {
			fwrite=new FileWriter(file,true);
			
		//fwrite.write(str);
			for(int i=0;i<str.length();i++)
				fwrite.write(str.charAt(i));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fwrite.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
