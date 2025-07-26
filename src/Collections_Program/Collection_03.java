package Collections_Program;

import java.util.ArrayList;
import java.util.Arrays;

public class Collection_03 {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		
		Object[] arr = list1.toArray();
		System.out.println(Arrays.toString(arr));
		

	}

}
