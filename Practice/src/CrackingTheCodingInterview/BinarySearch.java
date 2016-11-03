package CrackingTheCodingInterview;

import java.util.Arrays;
import java.util.Scanner;

class IceCream implements Comparable{
    int flavor;
    int index;

    public IceCream(int flavor, int index) {
      
        this.flavor=flavor;
        this.index=index;
        
    }
   
    @Override
    public int compareTo(Object o) {
        
      if(o instanceof IceCream)
            {
            
            IceCream i=(IceCream)o;
            return this.flavor-i.flavor; 
        }
        
        else
            {
            return 0;
            //System.out.print("different objects");
        }
    }

    @Override
    public boolean equals(Object o){
       
        if(o instanceof IceCream)
            {
            
            IceCream i=(IceCream)o;
            return this.flavor==i.flavor;
        }
        
        else
            {
            return false;
            //System.out.print("different objects");
        }
    }
        
}

public class BinarySearch {
   
    public static int binarySearch(int first, int last, IceCream[] arr, int search) {
        
        int mid=(first+last)/2;
        if(arr[mid].equals(search))
            return arr[mid].index;
        
        if(first>last)
        	return -1;
        
        if(arr[mid].compareTo(search)<1)
            return binarySearch(mid+1,last,arr,search);
        else if(arr[mid].compareTo(search)>1)
            return binarySearch(first,mid-1,arr,search);
            
        
        return -1;
        
        
    }

    public static void main(String[] args) {
        
        int t;
        int n, m;
 
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
       for(int test = 0; test < t; test++) {       
            
            m = in.nextInt();
            n = in.nextInt(); 
            IceCream[] arr = new IceCream[n];
    
            for (int i = 0; i < n; i++)
                arr[i] = new IceCream(in.nextInt(), i + 1);
            
            Arrays.sort(arr);
            int firstIndex = 100000, secondIndex = 100000;
            for(int i = 0; i < n - 1 ; i++) {
                int search = m - arr[i].flavor;
                if(search >= arr[i].flavor) {
                    int index = binarySearch( i + 1, n - 1, arr, search);
                    if( index != -1 ) {
                        System.out.println( Math.min(arr[i].index, index) + " " + Math.max(arr[i].index, index));
                        break;

                    }
                }
            } 
            
        }
        
    }
                        
}
