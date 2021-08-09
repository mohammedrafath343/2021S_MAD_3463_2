/**
 * 
 */
package week6_private;


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
		cls1.setFirstName("Rafath");
		cls1.setLastName("Mohammed");
		cls1.setTotal(100.99);
		
		System.out.println(cls1.getFirstName() +" "+ cls1.getLastName()+" "+ cls1.getTotal());
		
		Class2 cls2 = new Class2();
		cls2.setFirstName("Venkat");
		cls2.setLastName("Sandela");
		cls2.setTotal(200.99);
		
		System.out.println(cls2.getFirstName() +" "+ cls2.getLastName()+" "+ cls2.getTotal());
	}

}
