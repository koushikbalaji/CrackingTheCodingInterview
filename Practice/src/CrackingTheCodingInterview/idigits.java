package CrackingTheCodingInterview;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class idigits {

	public static void main(String[] args)
	{
		Long x = 823315L;
		
		String digits = String.valueOf(x);
		System.out.println(digits);
	    char[] cd = digits.toCharArray();
	    Long biggest = 0L;
	    float avg=0;
	    String average;
	    for(int i =1; i<cd.length; i++){
	    	/*if(cd[i]==cd[i+1])
	    			{*/
	    		//System.out.println("insdie");
	    	float sum=Character.getNumericValue(cd[i])+Character.getNumericValue(cd[i-1]);
	    	avg=(sum)/2;
	    	
	    			StringBuilder big = new StringBuilder();
	    			
	    			int av=(int)Math.ceil(avg);
	    			average=Integer.toString(av);
	    				big = big.append(digits.substring(0,i-1)).append(average).append(digits.substring(i+1,cd.length));
	    				if(biggest<Long.parseLong(big.toString()))
	    				biggest = Long.parseLong(big.toString());
	    				//System.out.println("Each step "+big.toString());
	    				//break;
	    				
	    			
	    }
	    System.out.println(biggest);
		
	}
	
}
