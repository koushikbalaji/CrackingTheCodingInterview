
import java.util.ArrayList;
import java.util.Scanner;

public class NodeClassify {

	public static void main(String ar[])
	{
		Scanner scan=new Scanner(System.in);
		int testCases= scan.nextInt();
		for(int i=0;i<testCases;i++)
		{
			String jack=scan.next();
			String daniel=scan.next();
			
			String outputString="";
			int a=-1;
			int jackIndex=0;
			int danielIndex=0;
			int jackSize=jack.length();
			int danielSize=daniel.length();
			int j=0,d=0;
			int jackPointer=0,danielPointer=0;
			
			while(jackSize>j&&danielSize>d)
			OUTER:
				{
				if(jack.charAt(j)<daniel.charAt(d))
					{
//					outputString=outputString+jack.get(jack.size()-1);
					System.out.print(jack.charAt(j));
//					jack.remove(jackSize-1)
					j++;
					}
				else if(jack.charAt(j)>daniel.charAt(d))
					{
//					outputString=outputString+daniel.get(daniel.size()-1);
					System.out.print(daniel.charAt(d));
//					daniel.remove(danielSize-1);	
					d++;
					}
					else
					{
					if(j<jackIndex&&d<danielIndex)
					{
						if(a==1)
						{
							System.out.print(jack.charAt(j));
//							jack.remove(jackSize-1);
							j++;
							break OUTER;
						}
						else if(a==2)
						{
							System.out.print(daniel.charAt(d));
//							daniel.remove(danielSize-1);
							d++;
							break OUTER;
						}
					}
					else
					{
						a=-1;
					}
					if(a==-1)
					{
						jackPointer=j;
						danielPointer=d;
					while(jackSize>=jackPointer+1&&danielSize>=danielPointer+1&&(jack.charAt(jackPointer)==daniel.charAt(danielPointer)))
					{
						jackPointer++;
						danielPointer++;
					}
					}
					jackPointer--;
					danielPointer--;
					jackIndex=jackPointer;
					danielIndex=danielPointer;
					
					if(jackSize==jackPointer+1||danielSize==danielPointer+1)
					{
						if(jackSize==jackPointer+1)
						{
//							outputString=outputString+daniel.get(daniel.size()-1);
							
							System.out.print(daniel.charAt(d));
//							daniel.remove(danielActualSize-1);
							d++;
							a=2;
						}
						else
						{
//							outputString=outputString+jack.get(jack.size()-1);
							System.out.print(jack.charAt(j));
//							jack.remove(jackActualSize-1);
							j++;
							a=1;
						}
					}
					else
						{
						if(jack.charAt(jackPointer+1)<daniel.charAt(danielPointer+1))
							{
//							outputString=outputString+jack.get(jack.size()-1);
							System.out.print(jack.charAt(j));
//							jack.remove(jackActualSize-1);
							j++;
							a=1;
							}
						else
							{
//							outputString=outputString+daniel.get(daniel.size()-1);
							System.out.print((daniel.charAt(d)));
//							daniel.remove(danielActualSize-1);
							d++;
							a=2;
							}
						}
					}
				}
			if(jack.length()==j||daniel.length()==d)
			{
				if(jack.length()==j)
				{
					for(int l=d;l<daniel.length();l++)
//						outputString=outputString+daniel.get(j);
						System.out.print(daniel.charAt(l));
				}
				else
				{	
					for(int l=j;l<jack.length();l++)
//						outputString=outputString+jack.get(j);
						System.out.print(jack.charAt(l));
				}
			}
			System.out.println();
		}
		scan.close();
	}
}
