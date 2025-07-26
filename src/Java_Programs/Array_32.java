package Java_Programs;

public class Array_32 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int half=a.length/2;
		for(int i=a.length-1;i>=half;i--)
		{
			System.out.println(a[i]);
		}

	}

}
