package CrackingTheCodingInterview;

public class StringReverse {

	static String reverseString(String input)
	{
		char[] arr=input.toCharArray();
		
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			while(i<arr.length&&arr[i]==' ')
				i++;
			
			j=i;
			while(j<arr.length&&arr[j]!=' ')
				j++;
			
			if(j!=i)
			reverse(arr,i,j-1);
			
			i=j;
		}
		
		return new String(arr);
	}
	
	public static void reverse(char[] arr,int start, int end)
	{
		char temp;
		for(int i=start,j=end;i<end;i++,j--)
		{
			if(j>i)
			{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
		}
		
	}
	
	public static void main(String ar[])
	{
		
		System.out.println(reverseString("  Iam     hello   "));
		
		
	}
	
	
	
	
}
