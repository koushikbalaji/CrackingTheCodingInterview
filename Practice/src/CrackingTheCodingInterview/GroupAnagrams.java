package CrackingTheCodingInterview;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagrams {
	
	public List<List<String>> grouper(String[] strs)
	{
		ArrayList<List<String>> output=new ArrayList<List<String>>();
		
		
		
		
		return output;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(this==o)
			return true;
		if(this.getClass()!=o.getClass())
			return false;
		
		String temp=this.toString();
		int[] charCount=new int[26];
		for(char a:temp.toCharArray())
			charCount[a-'a']++;
		
		temp=o.toString();
		for(char b:temp.toCharArray())
		{
			if(charCount[b-'a']<=0)
				return false;
			else
				charCount[b-'a']--;
					
		}
		
		
		
		return true;
	}
	
	@Override
	public int hashCode()
	{
		
		
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a=new String("hi");
		String b=new String("hi");
		System.out.println(a.equals(b));

	}

}
