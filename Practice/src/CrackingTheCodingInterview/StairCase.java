package CrackingTheCodingInterview;

import java.util.HashMap;
import java.util.Scanner;

public class StairCase {
    
    static HashMap<Integer,Integer> map=new HashMap<>();
    
    //iterative
    /*public static int countWays(int n)
        {
        
        if(n==0)
            return 0;
        if(n==1)
            return 1;
         if(n==2)
            return 2;
        if(n==3)
            return 4;
        
        int a=1;
        int b=2;
        int c=4;
        int d=0;
        
        for(int i=4;i<=n;i++)
            {
            d=a+b+c;
            a=b;
            b=c;
            c=d;
            
        }
        
        return d;
       
    }*/
    
    public static int countWays(int n)
        {
        
    	 if(n < 0)
    	        return 0;

    	    if(n == 0)
    	        return 1;

    	    if(!map.containsKey(n)) {
    	        int count = countWays(n-1) + countWays(n-2) + countWays(n-3);
    	        map.put(n, count);
    	    }
    	    return map.get(n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            System.out.println(countWays(n));
        }
    }
}