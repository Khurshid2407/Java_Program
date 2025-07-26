package Collections_Program;

import java.util.LinkedList;
import java.util.List;

public class Collection_07 {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");
        list.add("Blue berry");

        List<String> subList = list.subList(1, 4);

        System.out.println("Original List: " + list);
        System.out.println("Sublist: " + subList);

	}

}
