package CrackingTheCodingInterview;

import java.util.HashMap;

public class AnagramConvert {
	
	public static int numberNeeded(String first, String second) {
	      
		if(first.length()==0&&second.length()==0)
			return 0;
		if(first.length()==0&&second.length()!=0)
			return second.length();
		if(second.length()==0&&first.length()!=0)
			return first.length();
		
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int count=0;
        
        for(char a:first.toCharArray())
        {
        	if(map.containsKey(a))
        	{
        		count=map.get(a);
        		map.put(a, ++count);
        	}
        	else
        		map.put(a, 1);
        	
        }
        
        count=0;
        int temp=0;
        for(char a:second.toCharArray())
        {
        	if(map.containsKey(a))
        	{
        		temp=map.get(a);
        		map.put(a,temp-1);
        		if(map.get(a)==0)
        			map.remove(a);
        	}
        	else
        	{
        		count++;
        	}
        	
        
        }
        
        for(int a:map.values())
        	count+=a;
        
        return count;
    }
	
	public static void main(String ar[])
	{
		System.out.println(numberNeeded("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
	}

}
