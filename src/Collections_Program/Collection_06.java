package Collections_Program;

import java.util.Arrays;
import java.util.LinkedList;

public class Collection_06 {

	public static void main(String[] args) {
	
		LinkedList<String> list1 = new LinkedList();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		
		Object[] arr = list1.toArray();
		System.out.println(Arrays.toString(arr));

	}

}
