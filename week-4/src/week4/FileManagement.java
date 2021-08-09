package week4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.Random;

/* *
 * Author Rafath
 * 
 */

public class FileManagement {
	/**
	 * @param args
	 * @throws IOException	
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
//			PrintWriter obj1 = new PrintWriter("c0818332.txt");
			
			FileWriter fw = new FileWriter("c0818332.txt", true);
			
			PrintWriter obj2 = new PrintWriter(fw);
			obj2.println("abcd");
			obj2.close();
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
