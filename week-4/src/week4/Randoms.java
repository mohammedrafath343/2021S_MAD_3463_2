/**
 * 
 */
package week4;

import java.util.Random;

/**
 * @author Rafath
 *
 */
public class Randoms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random obj1 = new Random();
		
		float num1 = obj1.nextFloat();
		System.out.println(num1);
		
		double num2 = obj1.nextDouble();
		System.out.println(num2);
		
		int num3 = obj1.nextInt();
		System.out.println(num3);
		
		int num4 = obj1.nextInt(25 - 0) + 0;
		System.out.println(num4);
	}

}
