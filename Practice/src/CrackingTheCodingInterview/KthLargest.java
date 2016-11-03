package CrackingTheCodingInterview;

import CareerCup.QuickSelect;

public class KthLargest {
	
	public int quickSelect(int[] nums,int k)
	{
		
		return quickSelectUtil(nums,k,0,nums.length-1);
		
	}
	
	public int quickSelectUtil(int[] nums,int k,int start,int end)
	{
		int pivot=nums[end];
		int i=start,j=end-1;
		
		while(i<end&&j>=start&&j>i)
		{
			while(i<end&&nums[i]<=pivot) i++;
			while(j>=start&&nums[j]>pivot) j--;
			
			if(i<end&&j>=start&&j>i)
			{
				swap(i,j,nums);
				i++;j--;
			}
		}
		
		int pos=(i==j)?i+1:i;
		
		swap(pos,end,nums);
		
		if(pos==k)
			return pivot;
		
		if(pos>k)
			return quickSelectUtil(nums,k,start,pos-1);
		else if(pos<k)
			return quickSelectUtil(nums,k-pos-1,pos+1,end);
		
		
		return -1;
	}
	
	public static void swap(int i,int j,int[] nums)
	{
		
		int temp=nums[j];
		nums[j]=nums[i];
		nums[i]=temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums={11,2,3,4,5};
		
		System.out.println(new KthLargest().quickSelect(nums,2));
		

	}

}
