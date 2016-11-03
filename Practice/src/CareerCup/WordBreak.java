package CareerCup;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {

	public static Boolean findWord(String s,Set<String> dict)
	{
		
		boolean[] f = new boolean[s.length() + 1];
        f[0] = true;
        String temp=null;

        for(int i=1; i <= s.length(); i++){
            for(int j=0; j < i; j++){
            	temp=s.substring(j, i);
                if(f[j] && dict.contains(temp)){
                    f[i] = true;
                    break;
                }
            }
        }
        
        return f[s.length()];
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set=new HashSet<>();
		set.add("leet");
		set.add("code");
		
		System.out.println(findWord("leetcode",set));

	}

}
