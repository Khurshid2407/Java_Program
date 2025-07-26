package Java_Programs;

public class Array_11 {

	public static void main(String[] args) {
		
		int a[] = {15, 2, 16, 8, 10,2,5,2};
        int avg=0;
        int sum=0;
        for(int i=0;i<a.length;i+=2)
        {
            sum=sum+a[i];
        }
       avg=sum/a.length;
       System.out.println(avg);

	}

}
