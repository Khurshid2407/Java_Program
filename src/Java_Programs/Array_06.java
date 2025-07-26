package Java_Programs;

public class Array_06 {

	public static void main(String[] args) {
		
		int a[] = {1, 2, 5, 8, 10,0,-76};
        int sum=0;
        int avg=0;
        for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/a.length;
		System.out.println("avg: "+avg);


	}

}
