import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SavePrincess {
static void displayPathtoPrincess(int n, String [] grid){
	int botRow=0,botCol=0,princessRow=0,princessCol=0;
	for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)
		{
			if(grid[i].charAt(j)=='m')
			{
				botRow=i;
				botCol=j;
			}
			if(grid[i].charAt(j)=='p')
			{
				princessRow=i;
				princessCol=j;
			}
		}
	
	int colNum=botCol-princessCol;
	int rowNum=botRow-princessRow;
	
    if(botRow==princessRow)
    {
    	if(botCol==princessCol)
    	{
    		return;
    	}
    	else
    	{
    		if(colNum<0)
	    		while(colNum!=0)
	    		{
	    		System.out.println("RIGHT");
	    		colNum++;
	    		}
    		else
    			while(colNum!=0)
    			{
    				System.out.println("LEFT");
    				colNum--;
    			}
    		return;
    	}
    }
    else
    {
    	if(botCol==princessCol)
		{
    		if(rowNum<0)
	    		while(rowNum!=0)
	    		{
	    		System.out.println("DOWN");
	    		rowNum++;
	    		}
    		else
    			while(rowNum!=0)
    			{
    				System.out.println("UP");
    				rowNum--;
    			}
    		return;
			}
    	else
    	{
    		if(rowNum<0)
	    		while(rowNum!=0)
	    		{
	    		System.out.println("DOWN");
	    		rowNum++;
	    		}
    		else
    			while(rowNum!=0)
    			{
    				System.out.println("UP");
    				rowNum--;
    			}
    		
    		if(colNum<0)
	    		while(colNum!=0)
	    		{
	    		System.out.println("RIGHT");
	    		colNum++;
	    		}
    		else
    			while(colNum!=0)
    			{
    				System.out.println("LEFT");
    				colNum--;
    			}
    		return;
    	}
    }
    
    
  }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
            
        }
    displayPathtoPrincess(m,grid);
    }
}
