package Java_Programs;

public class Array_04 {

	public static void main(String[] args) {
		
		 int a[] = {1, 2, 0, 4, -5};
	        int min =Integer.MAX_VALUE;
	        int min2 =Integer.MAX_VALUE;

	        for(int i=0; i<a.length;i++)
	        {
	            if(a[i]<min)
	            {
	                min2=min;
	                min=a[i];
	            }
	            else if(a[i]< min2 && a[i] !=min)
	            {
	                min2=a[i];
	            }
	        }
	        System.out.println("Smallest: " + min);
	        System.out.println("Second Smallest: " + min2);


	}

}
