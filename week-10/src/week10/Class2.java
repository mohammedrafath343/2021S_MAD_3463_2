/**
 * 
 */
package week10;

/**
 * @author Rafathullah
 *
 */
public class Class2 {
	static int num = 0;

	// Increment number by 5 using a constructor
	public Class2() {
		num += 5;
		num2 += 5;
	}
	

	// Increment number by 5 using a constructor with parameter
	public Class2(int a) {
		num += a;
		num2 += a;
	}

	/**
	 * print num using static method
	 * 
	 */
	public static void methodA() {
		// TODO Auto-generated method stub
		System.out.println(num);

	}

	int num2;
	/**
	 * print num using static method
	 * 
	 */
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println(num2);

	}
}
