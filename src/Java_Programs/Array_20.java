package Java_Programs;

public class Array_20 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		int avg=0;
		int half=a.length/2;
		for(int i=half;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/half;
		System.out.println(avg);

	}

}
