package Java_Programs;

public class Test2 {

	public static void main(String[] args) {
		
		String s="selenium";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(s.indexOf(c)==s.lastIndexOf(c))
			{
				System.out.print(c);
			}
		}

	}

}
