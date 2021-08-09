/**
 * 
 */
package week6_public;

/**
 * @author Rafathullah
 *
 */
public class Class1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2 cls1 = new Class2();
		cls1.firstName ="Rafath";
		cls1.lastName ="Mohammed";
		cls1.total =100.99;
		
		System.out.println(cls1.firstName +" "+ cls1.lastName+" "+ cls1.total);
		
		Class2 cls2 = new Class2();
		cls2.firstName ="Venkat";
		cls2.lastName ="Sandela";
		cls2.total =200.99;
		
		System.out.println(cls2.firstName +" "+ cls2.lastName+" "+ cls2.total);
	}
}
