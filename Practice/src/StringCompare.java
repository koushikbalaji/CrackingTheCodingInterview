import java.util.ArrayList;

public class StringCompare {
	public static void main(String ar[])
	{
//		ArrayList<Integer> hi=new ArrayList<Integer>();
//
//		for(int i=0;i<5;i++)
//			if(i%2==0)
//				hi.add(new Integer(i));
//		
//		for(Integer b:hi)	
//			System.out.println(b);
		System.out.println(stringReverseInPlace(new String("hello").toCharArray()));
	}

	public static char[] stringReverseInPlace(char[] string) {
		  for(int i = 0, j = string.length - 1; i < string.length / 2; i++, j--) {
		    char c = string[i];
		    string[i] = string[j];
		    string[j] = c;
		  }
		  return string;
		}
}
