
public class GoogleFirstRound {

	// you can also use imports, for example:
	// import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	
	    public int solution(int[] A) {
	        // write your code in Java
	        int sum=0;
	        int leftSum=0;
	        for(int i=1;i<A.length;i++)
	        sum=sum+A[i];
	        
	        
	            if ((sum-A[0])==0)
	            //System.out.println(0);
	            	return 0;
	            
	        for(int i=1;i<A.length;i++)
	        {
	            sum=sum-A[i];
	            leftSum=leftSum+A[i-1];
	            if(leftSum==sum)
	            	//System.out.println(i);
	            	return i;
	            }
	    return-1;
	}
}
