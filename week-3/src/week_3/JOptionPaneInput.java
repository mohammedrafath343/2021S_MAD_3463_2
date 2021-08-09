package week_3;

import javax.swing.JOptionPane;

public class JOptionPaneInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Taking input from the user
		String name = JOptionPane.showInputDialog("Please enter your name");
		
		//Print the output
		JOptionPane.showMessageDialog(null, name);
		/*-------------------------------------------------------------------------*/
	
		//integer Example
		//Take input from the user
		String input = JOptionPane.showInputDialog("Please enter your age");
		
		//Convert String to integer
		int age = Integer.parseInt(input);
		JOptionPane.showMessageDialog(null, age);
		//Print the output
		//Exit
		System.exit(0);
	}

}
