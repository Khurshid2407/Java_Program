package Java_Programs;

public class Array_18 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int max=Integer.MIN_VALUE;
		int half=a.length/2;
		for(int i=half;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
