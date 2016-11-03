package CareerCup;

import java.util.HashMap;

public class StringPermutations {
	
	
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	
//	public int countMax(int[] arr)
//	{
//		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
//		for(int i=1;i<1000;i++)
//			map.put(i, 0);
//		
//		
//		for(int a:arr)
//		{
//			for(int b:map.keySet())
////			{
////				if(map.get(b)!=b)
////				
//////					{
//////					int value=map.get(b);
//////					map.put(b, )
//////					}
////			}
//			
//			
//		}
//		
//		
//		return 0;
//	}
	
	/*public List<String> printStrings(String input)
	{
		List
	}
	*/
	 static void consecutivePrint2(String str)
		{
			
			if(str==null)
				return;
			
			System.out.print(str.charAt(0));
			
			for(int i=1;i<str.length();i++)
			{
				if(str.charAt(i)-str.charAt(i-1)==1)
					System.out.print(str.charAt(i));
				else
				{
					System.out.println();
					System.out.print(str.charAt(i));
				}
			}
			
			
			
		}
	public static int countDuplicates(int[] arr)
	{
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int a:arr)
		{
			if(map.containsKey(a))
			{
				int count=map.get(a);
				map.put(a, ++count);
			}
			else
			{
				map.put(a, 0);
			}
		}
		
		int sum=0;
		for(int a:map.values())
		{
			if(a>0)
				sum+=a;
		}
		
		
		return sum;
	}
	
	static void subSequence(String string)
	{
		double n=string.length();
		
		char[] arr=string.toCharArray();
		// Pick starting point
		int opsize = (int) Math.pow(2, n);
		 
	    /* Run from counter 000..1 to 111..1*/
	    for (int counter = 1; counter < opsize; counter++)
	    {
	        for (int j = 0; j < n; j++)
	        {
	            /* Check if jth bit in the counter is set
	                If set then print jth element from arr[] */
	            if ((counter>=1) && (j>=1))
	                System.out.print(arr[j]);
	        }
	       System.out.println();
	    }
		
		
		
	}
	 public static void main(String args[])
	   {
	      /*String string, sub;
	      int i, c, length;
	 
	      string="abc";
	      //char[] arr=string.toCharArray();
	      //Arrays.sort(arr);
	      //string=new String(arr);
	      length = string.length();   
	 
	      //System.out.println("Substrings of \""+string+"\" are :-");
	      String[] output=new String[(length*(length+1)/2)+1];
	      
	      int index=0;
	      for( c = 0 ; c < length ; c++ )
	      {
	         for(  i = 1 ; i <= length - c ; i++ )
	         {
	            sub = string.substring(c, c+i);
	            output[index]=sub;
	            index++;
	         }
	      }
	      
	      List<String> out=new ArrayList<String>();
	      
	      for(int a=0;a<string.length();a++)
	    	  for(int b=a;b<string.length();b++)
	    	  {
	    		  
	    		sub=string.substring(a, b);
	    		System.out.println(sub);
	    		  
	    	  }
	      
	      
	      String A=string;
	      
	      for ( i = 0; i < A.length(); i++) {
	          for (int j = i+1; j <= A.length(); j++) {
	              System.out.println(A.substring(i,j));
	          }
	      }
	     
	      
	      output[index]="empty";
	      
	      for(String a:output)
	    	  System.out.println(a);
	      
	      int[] arr2={1,2,2,3,3,4};
	      //System.out.println(countDuplicates(arr2));
	       * 
	       * 
	       * 
*/	   
		 
	   //subSequence("abc");
		 
		 //consecutivePrint("ABCXYZACCD");
		 
		 int a=5;
		 int b=6;
		 
		/* a=a^b;
		 b=a^b;
		 a=a^b;
		 System.out.println(a+" "+b);
		 */
		 
		 a=a+b; //11
		 b=a-b; //5
		 a=a-b; //6
		 
		 System.out.println(a+" "+b);
		 
	   }
	
	public static void consecutivePrint(String s){
		System.out.print(s.charAt(0));
		for(int i=1;i<s.length();i++){
			if((s.charAt(i-1))==(s.charAt(i)-1)){
				System.out.print(s.charAt(i));
			}
			else{
				System.out.println();
				System.out.print(s.charAt(i));
			}
		}
	}

	

}
