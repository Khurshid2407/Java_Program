package Java_Programs;

public class Array_08 {

	public static void main(String[] args) {
		
		 int a[] = {1,2,5,8,10,2,5};
	        int sum=0;
	        for(int i=0;i<a.length;i++)
	        {
	            if(i%2==1)
	            {
	                sum=sum+a[i];
	            }
	        }
	        System.out.println(sum);


	}

}
