package org.cap.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Char_Inpur_Demo {

	public static void main(String[] args) {
		
		
		File file=new File("D:\\vidavid\\Training\\2016\\Trained_FLP_Chennai_2_May_2016_to_30_June_2016\\Trained_FLP\\Demo\\class_Room_Demo\\Day-May-12\\src\\main\\resources\\sample.txt");
		FileReader fread=null;
		
		try {
			fread=new FileReader(file);
			
			long fsize=file.length();
			
			while(fsize>0){
			int ch=fread.read();
			System.out.print((char)ch);
				fsize--;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fread.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		

	}

}
