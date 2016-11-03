package CareerCup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class findMaxLevel {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int input=16;
		int Actualinput=input;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(0);
		int max=Integer.MIN_VALUE;
		for(int i=1;i<Actualinput;i++)
		{
			if(input-i>=0)
			{
				arr.add(i);
				if(i>max)
					max=i;
			}
			else 
			{
				break;
			}
			
			input=input-i;
			
		}
		
		for(int a:arr)
		{
			if(a>max)
				max=a;
		}
		
		System.out.println(max);

	}*/
		        Scanner in = new Scanner(System.in);
		        int n = in.nextInt();
		        int c[] = new int[n];
		        for(int c_i=0; c_i < n; c_i++){
		            c[c_i] = in.nextInt();
		        }
		        
		        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		        for(int a:c)
		            {
		            if(map.containsKey(a))
		                {
		                int count=map.get(a);
		                map.put(a,count+1);
		                
		            }
		            
		            else  
		            {
		                map.put(a,1);
		                
		            }
		        }
		        
		        int total=0;
		        for(int b:map.values())
		            {
		            if(b>1)
		                {
		                total+=b/2;
		            }
		        }
		        
		        System.out.println(total);
		    }
		
	

}
