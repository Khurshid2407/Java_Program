package Java_Programs;

public class Array_16 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int min=Integer.MAX_VALUE;
		int half=a.length/2;
		for(int i=half;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
