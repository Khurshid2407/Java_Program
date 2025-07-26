package Java_Programs;

public class Array_09 {

	public static void main(String[] args) {
		
		int a[] = {15, 2, 6, 8, 10,2,5,2,20};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i+=2)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println(min);


	}

}
