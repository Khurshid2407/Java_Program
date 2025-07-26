package Collections_Program;

import java.util.Collections;
import java.util.LinkedList;

public class Collection_09 {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		System.out.println("Before reverse: "+list);
		Collections.reverse(list);
		System.out.println("After reverse: "+list);

	}

}
