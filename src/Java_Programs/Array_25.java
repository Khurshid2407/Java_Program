package Java_Programs;

public class Array_25 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7};
        for(int i=a.length-1;i>=0;i--) 
        {
            if(i%2==0) 
            {
                System.out.print(a[i]+" ");
            }
        }

	}

}
