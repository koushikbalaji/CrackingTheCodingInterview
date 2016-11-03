import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SavePrincess2 {
static void nextMove(int n, int r, int c, String [] grid){
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

	if(colNum==0&&rowNum==0)
		return;
	else
		if(colNum==0)
		{
			if(rowNum<0)
			{
				System.out.println("DOWN");
				return;
			}
			else
			{
				System.out.println("UP");
				return;	
			}
		}
		else
			if(rowNum==0)
			{
				if(colNum<0)
				{
					System.out.println("RIGHT");
					return;
				}
				else
				{
					System.out.println("LEFT");
					return;	
				}	
			}
			else
			{
				if(colNum<0)
				{
					System.out.println("RIGHT");
					return;
				}
				else
				{
					System.out.println("LEFT");
					return;	
				}	
			}
  }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,r,c;
        n = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        in.useDelimiter("\n");
        String grid[] = new String[n];


        for(int i = 0; i < n; i++) {
            grid[i] = in.next();
        }

    nextMove(n,r,c,grid);

    }
}
