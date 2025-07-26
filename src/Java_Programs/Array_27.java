package Java_Programs;

public class Array_27 {

	public static void main(String[] args) {
		
		int a[]= {2,4,6,8,0,5};
		for(int i=a.length;i>=0;i--)
		{
			if(i%2==1)
			{
				System.out.print(a[i]+" ");
			}
		}

	}

}
