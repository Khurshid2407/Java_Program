package Java_Programs;

public class Array_07 {

	public static void main(String[] args) {
		
		int a[] = {1, 2, 5, 8, 10,0,5};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(i%2==0)
            {
                sum=sum+a[i];
            }
        }
        System.out.println(sum);

	} 

}
