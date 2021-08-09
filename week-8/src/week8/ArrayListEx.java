package week8;


/**
 * @author Rafathullah
 *
 */

import java.util.ArrayList;

public class ArrayListEx {
	
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Create a string arraylist called list1
		
		ArrayList<String> list1 = new ArrayList<String>(); 
		//2. Create a int arraylist max size 20 called list2
		
		ArrayList<String> list2 = new ArrayList<String>(20);
		//3. Add bob and bill to list1print list 1
		
		list1.add("Bob");
		list1.add("Bill");
		//4. Print list1
		System.out.println(list1);
		//5. Print the size of list 1 and 2
		System.out.println(list1.size());
		System.out.println(list2.size());
		//6. replace bob and will with user1 and user2
		list1.set(0, "user1");
		list1.set(1, "user2");
		//7. Print list1
		System.out.println(list1);
		//8. Remove user1 and user2
		list1.remove(0);
		list1.remove(0);
		//9. Print list1
		System.out.println(list1);
	}

}
