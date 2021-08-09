/**
 * 
 */
package week10;

/**
 * @author Rafathullah
 *
 */
public class Class1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Calling methodA
		Class2.methodA();

		// Create an CLass2 object
		Class2 c1 = new Class2();
		// calling methodA
		Class2.methodA();
		// calling methodB
		c1.methodB();

		// Create an CLass2 c2 object with constructor params
		Class2 c2 = new Class2(10);
		// calling methodA
		Class2.methodA();
		// calling methodB
		c2.methodB();

		System.out.println("Print obj2" + c2.toString());
	}

}
