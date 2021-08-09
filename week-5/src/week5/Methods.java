/**
 * 
 */
package week5;

/**
 * @author Rafathullah
 *
 */
public class Methods {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodA();
		methodB("c0818384");
		double result = methodC(10, 20);
		
		System.out.println(result);
	}
	
	/**
	 * 1. prints your name
	 */
	public static void methodA() {
		System.out.println("c0818384");
	}
	
	/**
	 * @param String - name
	 * 
	 * 2. prints your name with param
	 */
	public static void methodB(String name) {
		System.out.println(name);
	}

	/**
	 * @param num1 - int
	 * @param num2 - int
	 * 
	 * 2. prints your name with param
	 */
	public static double methodC(double num1, double num2) {
		return num1 + num2;
	}

}
