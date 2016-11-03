package CrackingTheCodingInterview;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GetIslands {
    
	static int counter=0;
    public static int getBiggestRegion(int[][] matrix) {
    	 
    	int maxCounter=0;
    	for(int i=0;i<matrix.length;i++)
    		for(int j=0;j<matrix[0].length;j++)
    		{
    			if(matrix[i][j]==1)
    			{
    			counter=findCount(matrix,i,j); 
    			if(counter>maxCounter)
    				maxCounter=counter;
    			counter=0;
    			}
    		}
    	
    	return maxCounter;
    }
    
    public static int findCount(int[][] matrix,int row,int col)
    {
    	
    	
    	if(row<matrix.length&&col<matrix[0].length&&row>-1&&col>-1&&matrix[row][col]==1)
    		{
    		counter++;
    		matrix[row][col]=0;
    		}
    	else
    		return 0;
    	
    	findCount(matrix,row+1,col);
    	findCount(matrix,row,col+1);
    	findCount(matrix,row-1,col);
    	findCount(matrix,row,col-1);
    	findCount(matrix,row+1,col+1);
    	findCount(matrix,row-1,col-1);
    	findCount(matrix,row-1,col+1);
    	findCount(matrix,row+1,col-1);
    	
    	return counter;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(getBiggestRegion(grid));
    }
}
