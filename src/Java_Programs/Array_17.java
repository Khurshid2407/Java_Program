package Java_Programs;

public class Array_17 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,0};
		int max=Integer.MIN_VALUE;
		int half=a.length/2;
		for(int i=0;i<half;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
