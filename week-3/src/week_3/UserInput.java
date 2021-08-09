package week_3;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Created the scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// String example
		System.out.println("Please enter your name");
		
		// Take input from the user
		String name = keyboard.nextLine();
		
		// Print the output
		System.out.println(name);
		/*--------------------------------------------------*/

		// integer example
		// Ask the user for input
		System.out.println("Please enter your age");
		
		// Take input from the user
		int age = keyboard.nextInt();
		
		// Print the output
		System.out.println(age);
		keyboard.close();
	}

}
