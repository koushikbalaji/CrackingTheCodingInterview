package Arrays;



	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class SparseArrays {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scan=new Scanner(System.in);
	        int n=scan.nextInt();
	        String[] arr=new String[n];
	        
	        for(int i=0;i<n;i++)
	            arr[i]=scan.next();
	        
	        int q=scan.nextInt();
	        
	        for(int i=0;i<q;i++)
	            {
	            String curr=scan.nextLine();
	            int count=0;
	            
	            for(int j=0;j<n;j++)
	                if(arr[j]==curr||arr[j].equals(curr)) count++;
	            
	            System.out.println(count);
	        }
	        
	        
	    }
	}

