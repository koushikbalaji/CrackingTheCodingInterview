package CareerCup;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class FisrtNonRepeatingCharacter {

	public static void main(String ar[])
	{
		
		
		Scanner scan=new Scanner(System.in);
		Integer t=scan.nextInt();
		while(t>=0)
		{
			if(scan.hasNext())
			{
			new FisrtNonRepeatingCharacter().findFirst(scan.nextLine());
			t--;
			}
			
		}
		scan.close();
		
		
	}
	
	public void findFirst(String input)
	{
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		Integer count=0;
		
		for(Character a:input.toCharArray())
		{
			
			count=map.get(a);
			if(count==null)
			{
				map.put(a, 1);
				set.add(a);
				
			}
			
			else
			{
				
				map.put(a, ++count);
				set.remove(a);
			}
			
		}
		Iterator<Character> it=set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
			return;
			
		}
		
		System.out.println("no Character");
		
		
	}
	
}



