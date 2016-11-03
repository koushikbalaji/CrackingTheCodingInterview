package CareerCup;

import java.util.LinkedList;
import java.util.Queue;

public class SpiralPrint {

	public static void main(String ar[])
	{
		
		//int[][] mat=new int[4][5];
		
		int[][] mat={   {1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}       };
		
		new SpiralPrint().printSpiral(mat);
		
		//Queue<Integer> qu=new LinkedList<Integer>();
		
		
		
	}
	
	public void printSpiral(int[][] matrix)
	
	{
		
		int rows=matrix.length;
		int col=matrix[0].length;
		
		int k,l,m,j=0;
		
		for(int i=0;i<rows;i++)
		{
			for(j=0;j<col;j++)
				System.out.println(matrix[i][j]);

			j--;
			
			for(k=i+1;k<rows;k++)
				System.out.println(matrix[k][j]);
			
			
			for(l=k-1;l>=i;l--)
				System.out.println(matrix[k-1][l]);
			
				
			for(m=k-2;m>i;m--)
				System.out.println(matrix[m][l-1]);
					
			i++;
			j++;
			col--;
			rows--;
					
			
		}
	
	}
	
}
