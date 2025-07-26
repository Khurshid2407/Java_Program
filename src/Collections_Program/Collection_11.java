package Collections_Program;

import java.util.Iterator;
import java.util.LinkedList;

public class Collection_11 {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Iterator<String> itr=list.descendingIterator();
		while (itr.hasNext()) 
		{
            System.out.print(itr.next()+" ");
        }
		


	}

}
