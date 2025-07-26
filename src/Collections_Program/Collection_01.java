package Collections_Program;

import java.util.ArrayList;

public class Collection_01 {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList();
		list.add("khurshid");
		list.add("Alam");
		
		ArrayList<String> duplicate=new ArrayList<>(list);
		System.out.println("Original:"+list);
		System.out.println("Duplicate:"+duplicate);
		
		
	}

}
