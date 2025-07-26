package Collections_Program;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_04 {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		System.out.println("Before suffle: "+list);
		
		Collections.shuffle(list);
		System.out.println("After suffle: "+list);

	}

}
