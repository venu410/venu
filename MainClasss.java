package org.capgemini.demo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClasss {

	public static void main(String[] args) {
		
		try{
			
			Parent parent=new Child();
			parent.showAnswer();
		}catch(NullPointerException ex){
			System.out.println("Error:" + ex.getMessage());
		}catch (ArithmeticException e) {
			System.out.println("Error:" + e.getMessage());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Progarm Completed");
	}

}
