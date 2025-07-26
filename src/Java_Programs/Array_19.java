package Java_Programs;

public class Array_19 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int avg=0;
		int sum=0;
		int half=a.length/2;
		for(int i=0;i<half;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/half;
		System.out.println(avg);

	}

}
