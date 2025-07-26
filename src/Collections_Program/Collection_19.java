package Collections_Program;

import java.util.HashMap;

public class Collection_19 {

	public static void main(String[] args) {
		
		 HashMap<Integer, String> map = new HashMap<>();
	     map.put(1, "Java");
	     map.put(2, "Python");
	     map.put(3, "C++");

	     System.out.println("Before deleting: " + map);
	     
	     map.clear();

	     System.out.println("After deleting: " + map);

	}

}
