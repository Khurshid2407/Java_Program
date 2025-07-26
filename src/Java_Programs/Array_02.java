package Java_Programs;

public class Array_02 {

	public static void main(String[] args) {
		
		 int a[]={8,2,3,4,5};
         int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println(min);


	}

}
