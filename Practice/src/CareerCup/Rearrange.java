package CareerCup;

import java.util.Arrays;

public class Rearrange {

	public static String findNext(String input)
	{
		if(input==""||input.length()==1)
			return new String("no answer");
		
		char[] arr=input.toCharArray();
		
		int i=0;
		for(i=arr.length-1;i>0;i--)
		{
			if(arr[i]>arr[i-1])
				break;
		}
		
		if(i==0&&arr[1]<=arr[0])
			return "no answer";
		
		int l=0;
		for(l=arr.length-1;l>=i;l--)
		{
			if(arr[l]>arr[i-1])
				break;
		}
		
		
		char temp=arr[i-1];
		arr[i-1]=arr[l];
		arr[l]=temp;
		
		if(i!=arr.length-1)
			Arrays.sort(arr,i,arr.length);
		
		return new String(arr);
		
	}
	
	
	public static void main(String ar[])
	{
		
		System.out.println(findNext("aihgfedcba"));
		//Arrays.s
	}
	
}
