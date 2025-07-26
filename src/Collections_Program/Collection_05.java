package Collections_Program;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_05 {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		System.out.println("Before swap: "+list);
		
		Collections.swap(list,1,3);
		System.out.println("After swap: "+list);

	}

}
