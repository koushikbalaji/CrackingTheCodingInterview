package CrackingTheCodingInterview;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class MutationsLength {
	
	public static int ladderLength(String start, String end, String[] words) {
		
		Set<String> dict=new HashSet<String>();
		
		for(String a:words)
			dict.add(a);
		
		Queue<String> queue = new LinkedList<String>();
		  queue.add(start);
		  queue.add(null);
		  
		  // Mark visited word
		  Set<String> visited = new HashSet<String>();
		  visited.add(start);
		  
		  int level = 0;
		  char[] letter = {'A','T','G','C'};
		  
		  while (!queue.isEmpty()) {
		    String str = queue.poll();
		    
		    if (str != null) {
		      // Modify str's each character (so word distance is 1)
		      for (int i = 0; i < str.length(); i++) {
		        char[] chars = str.toCharArray();
		        
		        for(int c=0;c<letter.length;c++){
		          chars[i] = letter[c];
		          
		          String word = new String(chars);
		          
		          // Found the end word
		          if (word.equals(end)&&dict.contains(word)) return level + 1;
		          
		          // Put it to the queue
		          if (dict.contains(word) && !visited.contains(word)) {
		            queue.add(word);
		            visited.add(word);
		          }
		        }
		      }
		    } else {
		      level++;
		      
		      if (!queue.isEmpty()) { 
		        queue.add(null);
		      }
		    }
		  }
		  
		  return -1;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words={"AAAAAAAT","TTTTGGCC","TATTGGCC","AATTCGCC"};
		System.out.println(ladderLength("AATTGGCC","TTTTGGCA",words));
		
		/*AAAAAAAA
		AAAAAATT
		4
		AAAAAAAA
		AAAAAAAT
		AAAAAATT
		AAAAATTT*/


	}

}
