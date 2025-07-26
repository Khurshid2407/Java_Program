package Java_Programs;

public class Array_05 {

	public static void main(String[] args) {
		
		int a[] = {1, 2, 0, 4, 10};
        int min =Integer.MIN_VALUE;
        int min2 =Integer.MIN_VALUE;

        for(int i=0; i<a.length;i++)
        {
            if(a[i]>min)
            {
                min2=min;
                min=a[i];
            }
            else if(a[i]>min2 && a[i] !=min)
            {
                min2=a[i];
            }
        }
        System.out.println("Max:" + min);
        System.out.println("Second Max: " + min2);


	}

}
