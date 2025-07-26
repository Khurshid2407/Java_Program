package Collections_Program;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Collection_20 {

	public static void main(String[] args) {
		
		int a[]= {1,2,2,3,4,4,5,6,6};
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int num:a)
		{
			set.add(num);
		}
		Object[] arr = set.toArray();
		System.out.println("Original: "+Arrays.toString(a));
		System.out.println("After remove duplicate: "+Arrays.toString(arr));
		

	}

}
