package CareerCup;

public class QuickSelect {
	
	
	public static void quickSelect(int[] n)
	{
		
		int pivot=n[n.length-1];
		
		
		int low=0,high=n.length-2,temp=0;

		while(low<high)
		{
			

			if(n[low]>pivot&&n[high]<pivot)
			{
				temp=n[low];
				n[low]=n[high];
				n[high]=temp;
				high--;
				low++;
				
			}
			else{
				if(n[low]<pivot)
					low++;
				
				if(n[high]>pivot)
					high--;
				
			}
			
		}

		temp=n[low];
		n[low]=pivot;
		n[n.length-1]=temp;
		
		for(int i=0;i<n.length;i++)
			System.out.print(n[i]+" ");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={2,4,12,23,34,1,-1,3,24,9};
		quickSelect(a);
	}

}
