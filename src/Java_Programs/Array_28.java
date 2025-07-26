package Java_Programs;

public class Array_28 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,0};
		int findElement=5;
		boolean elementPresent=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==findElement)
			{
				System.out.println("Element:"+a[i]+", position:"+i);
				elementPresent=true;
				break;
			}
		}
		if(!elementPresent)
		{
			System.out.println("Element not present...");
		}

	}

}
