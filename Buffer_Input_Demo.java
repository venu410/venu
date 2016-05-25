package org.cap.demo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Buffer_Input_Demo {

	public static void main(String[] args) {
		
		File file=new File("D:\\vidavid\\Training\\2016\\Trained_FLP_Chennai_2_May_2016_to_30_June_2016\\Trained_FLP\\Demo\\class_Room_Demo\\Day-May-12\\src\\main\\resources\\myfile.txt");
		
		FileInputStream fin=null;
		BufferedInputStream bin=null;
		try{
			fin=new FileInputStream(file);
			bin=new BufferedInputStream(fin);
			
			byte[] ansBytes=new byte[100];
			bin.read(ansBytes,0,10);
			
			String str=new String(ansBytes);
			
			System.out.println(str);
			
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
