package CareerCup;

import java.util.HashMap;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
       int[] output=new int[2];
       int i=0;
       for(int a: nums)
       {
           map.put(a,i);
           i++;
       }
       
       i=0;
       for(int a:nums)
       {
           if(map.containsKey(target-a)&&map.get(target-a)!=i)
           {
               output[0]=i;
               output[1]=map.get(target-a);
               return output;
           }
           else
               i++;
           
           }
           
            return null;
       
   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a={3,2,4};
		a=twoSum(a,6);
		for(int b:a)
		System.out.println(b);
	}

}
