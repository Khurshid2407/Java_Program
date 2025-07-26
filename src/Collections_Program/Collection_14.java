package Collections_Program;

import java.util.HashMap;
import java.util.Map;

public class Collection_14 {

	public static void main(String[] args) {
		
		 Map<Integer, String> map = new HashMap();
	        map.put(1, "Apple");
	        map.put(2, "Banana");
	        map.put(3, "Mango");

	        Map<Integer, String> copiedMap = new HashMap<>(map);

	        System.out.println("Copied Map: "+copiedMap);

	}

}
