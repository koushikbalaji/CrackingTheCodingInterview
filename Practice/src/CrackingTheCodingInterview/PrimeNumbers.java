package CrackingTheCodingInterview;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
	
	public static List<Integer> findPrimes(int n)
	{
		List<Integer> list=new ArrayList<>();
		boolean[] output=new boolean[n+1];
		
		/*for(int i=2;i<Math.sqrt(n);i++)
			for(int j=2;j<=n;j++)
			{
				System.out.println("jana loose koothi");
				
			}*/

		

		for(int i=2;i<Math.sqrt(n);i++)
			for(int j=2;j<=n;j++)
			{
				System.out.println("jana badu");
			}
		for(int k=1;k<=n;k++)
		{
			if(!output[k])
				list.add(k);
		}
		
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findPrimes(100));
	}

}
