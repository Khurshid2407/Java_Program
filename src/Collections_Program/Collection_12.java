package Collections_Program;

import java.util.HashSet;

public class Collection_12 {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
			
		System.out.println("Original :"+set);
			
		HashSet<String> copySet=new HashSet<String>(set);
		System.out.println("Copy :"+copySet);

	}

}
