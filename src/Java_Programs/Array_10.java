package Java_Programs;

public class Array_10 {

	public static void main(String[] args) {
		
		int a[] = {15, 2, 16, 8, 10,2,5,2};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i+=1)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);


	}

}
