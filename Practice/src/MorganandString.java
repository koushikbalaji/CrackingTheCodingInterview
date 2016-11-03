
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
 class Suffix implements Comparable<Suffix>
{
	 int index;
	 String suffix;
	 
	public Suffix(int index, String suffix) {
		super();
		this.index = index;
		this.suffix = suffix;
	}
	
	@Override
	public int compareTo(Suffix other) {
		// TODO Auto-generated method stub
//		this.suffix.compareTo(other.suffix);
		return this.suffix.compareTo(other.suffix);
	}
	 
	}

public class MorganandString  {

	public static int[] findSuffixArray(String text,int jackSize)
	{
		int length=text.length();
		int[] suffixArray=new int[length];
		Suffix[] stringArray=new Suffix[length];
		
		for(int i=0;i<jackSize;i++)
			stringArray[i]=new Suffix(i,text.substring(i));
		for(int i=jackSize+1;i<length;i++)
			stringArray[i]=new Suffix(i,text.substring(i));
		
		stringArray[jackSize]=new Suffix(jackSize,"{");
			
		Arrays.sort(stringArray,new Comparator<Suffix>()
				{
					@Override
					public int compare(Suffix o1, Suffix o2) {
						// TODO Auto-generated method stub
						return o1.suffix.compareTo(o2.suffix);
					}
			});
		
		for(int i=0;i<length-1;i++)
			{
			int index=stringArray[i].index;
			suffixArray[index]=i;
//			System.out.println(stringArray[i].index+" "+stringArray[i].suffix);
//			suffixArray[i]=stringArray[i].index;
			}
		
		return suffixArray;
	}
	public static void main(String ar[])
	{
		Scanner scan=new Scanner(System.in);
		int testCases= scan.nextInt();
		for(int i=0;i<testCases;i++)
		{
			String jackString=scan.next();
			String danielString=scan.next();
			int jackSize=jackString.length();
			int danielSize=danielString.length();
			int[] suffixArray=findSuffixArray(jackString+"z"+danielString,jackSize);
			
			int j=0,d=0;
			while(jackSize>j&&danielSize>d)
			{
				if(jackString.charAt(j)<danielString.charAt(d))
					{
					System.out.print(jackString.charAt(j));
					j++;
					}
				else if(jackString.charAt(j)>danielString.charAt(d))
					{
					System.out.print(danielString.charAt(d));
					d++;
					}
					else
					{
						if(suffixArray[j]<suffixArray[jackSize+d+1])
						{
							System.out.print(jackString.charAt(j));
							j++;	
						}
						else
						{
							System.out.print(danielString.charAt(d));
							d++;
						}
						
					}
			}
			if(jackString.length()==j||danielString.length()==d)
			{
				if(jackString.length()==j)
				{
					for(int l=d;l<danielString.length();l++)
						System.out.print(danielString.charAt(l));
				}
				else
				{	
					for(int l=j;l<jackString.length();l++)
						System.out.print(jackString.charAt(l));
				}
			}
			System.out.println();
			
		}
			
		scan.close();
	}
}
