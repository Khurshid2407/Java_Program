package Collections_Program;

import java.util.HashMap;

public class Collection_15 {

	public static void main(String[] args) {
		
		HashMap<String , Integer> map=new HashMap<String , Integer>();
		map.put("a",1);
		map.put("b",2);
		map.put("c",3);
		map.put("d",5);
		
		String stringKey="z";
		
		if(map.containsKey(stringKey))
		{
			System.out.println(map.get(stringKey));
		}
		else
		{
			System.out.println("Key not present: "+stringKey);
		}

	}

}
