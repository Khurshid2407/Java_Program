package Java_Programs;

public class Array_29 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int firstIndex=a[5];
		int secondIndex=a[3];
		System.out.println("Before swap");
		System.out.println(firstIndex+" "+secondIndex);
		int b=firstIndex+secondIndex;
		firstIndex=b-firstIndex;
		secondIndex=b-secondIndex;
		System.out.println("After swap");
		System.out.println(firstIndex+" "+secondIndex);

	}

}
