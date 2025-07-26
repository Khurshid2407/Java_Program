package Collections_Program;

import java.util.ArrayList;

public class Collection_02 {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		
		ArrayList<String> list2=new ArrayList();
		list2.add("b");
		list2.add("d");
		
		if(list1.containsAll(list2))
		{
			System.out.println("List1 contains List2 element");
		}
		else
		{
			System.out.println("List1 not contains List2 element");
		}
		
		

        

	}

}
