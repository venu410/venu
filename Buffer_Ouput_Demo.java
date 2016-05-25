package org.cap.demo;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffer_Ouput_Demo {

	public static void main(String[] args) {
		
		File file=new File("D:\\vidavid\\Training\\2016\\Trained_FLP_Chennai_2_May_2016_to_30_June_2016\\Trained_FLP\\Demo\\class_Room_Demo\\Day-May-12\\src\\main\\resources\\myfile.txt");
		
		FileOutputStream fout=null;
		BufferedOutputStream bout=null;
		try{
			fout=new FileOutputStream(file);
			bout=new BufferedOutputStream(fout);
			
			String str="Welcome To File Input and Output!";
			
			byte[] strbytes= str.getBytes();
			bout.write(strbytes);
			
			
			
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
			bout.close();
			fout.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}

	}

}
