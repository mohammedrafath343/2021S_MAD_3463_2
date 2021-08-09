package week8;

/**
 * @author Rafathullah
 *
 */
public class ArrayEx {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		final int FIXED_ARR_LENGTH = 10;
		int[] arr = new int[FIXED_ARR_LENGTH];
		String[] strArr = { "aarr", "abc"};
		
		arr[0] = 1;
		arr[1] = 2;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		
		strArr[0] = "FirstName";
		strArr[1] = "LastName";
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		for (int num: arr) {
		      System.out.println(num);
	    }
	}

}
