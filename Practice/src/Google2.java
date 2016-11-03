

import java.util.ArrayList;

public class Google2 {
	public int solution(String S) {
        // write your code in Java
		String[] paths;
		paths=S.split("\n");
		ArrayList<Integer> indices=new ArrayList<Integer>();
		
		for(int i=0;i<paths.length;i++)
		{
			String curr=paths[i];
			if(curr.contains(".jpeg")||curr.contains(".png")||curr.contains(".gif"))
				indices.add(i);
		}
		
		int spaces=0;
		int spaces2=0;
		int length=0;
		int temp=0;
		String tempString;
		for(int j=0;j<indices.size();j++)
			{
			temp=indices.get(j);
			length=length+(paths[temp].length())+1;
			for(int k=j-1;j>0;j--)
			{
				spaces=countSpaces(paths[k]);
				spaces2=countSpaces(paths[k--]);
					
			}
			}			
		return 0;
    }
	
	public int countSpaces(String a)
	{
		int count=0;
		
		for(int i=0;i<a.length();i++)
			if(a.charAt(i)==' ')
				count++;
		
		return count;
	}
	
	

}
