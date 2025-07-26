package Collections_Program;

import java.util.HashMap;

public class Collection_16 {

	public static void main(String[] args) {
		
		 HashMap<Integer, String> map = new HashMap<>();
	     map.put(1, "apple");
	     map.put(2, "banana");
	     map.put(3, "mango");

	     String searchValue = "banana";
	     
	     if (map.containsValue(searchValue)) 
	     {
	        System.out.println("Value present: " + searchValue);
	     } 
	     else 
	     {
	        System.out.println("Value not present: " + searchValue);
	     }

	}

}
