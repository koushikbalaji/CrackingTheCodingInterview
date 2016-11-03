
import java.util.Scanner;

public class RelatedSpecies {

	public static Boolean checkSorted(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{ 
		    if (a[i] < a[i+1]) 
		        return true;
		    else
		        return false;
		}
		return false;
	}
	public static void main(String ar[])
	{
		Scanner scan=new Scanner(System.in);
		int testCases=scan.nextInt();
		for(int i=0;i<testCases;i++)
		loop: {
			int number=scan.nextInt();
			int[] firstSequence=new int[number];
			int[] secondSequence=new int[number];
			for(int num=0;num<number;num++)
				firstSequence[num]=scan.nextInt();
			for(int num=0;num<number;num++)
				secondSequence[num]=scan.nextInt();
			
			if(checkSorted(firstSequence)||checkSorted(secondSequence))
				{
				System.out.println("YES");
				break loop;
				}
			
			int[] tempArray=new int[number];
			tempArray[0]=(firstSequence[0]<=secondSequence[0]?firstSequence[0]:secondSequence[0]);
			for(int num=1;num<number;num++)
			{	if(firstSequence[num]>tempArray[num-1]&&secondSequence[num]>tempArray[num-1])
				tempArray[num]=(firstSequence[num]-tempArray[num-1]<=secondSequence[num]-tempArray[num-1]?firstSequence[num]:secondSequence[num]);
				else if(firstSequence[num]>tempArray[num-1])
					tempArray[num]=firstSequence[num];
				else if(secondSequence[num]>tempArray[num-1])
					tempArray[num]=secondSequence[num];
				else
					{
					System.out.println("NO");
					break loop;
					}
			
			}	
			
			if(checkSorted(tempArray))
				System.out.println("YES");
			else
				System.out.println("NO");
			
			
		}
		scan.close();
	}
}