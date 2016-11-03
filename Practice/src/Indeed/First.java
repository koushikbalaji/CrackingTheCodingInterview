package Indeed;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class First {

	static Stack<Integer> stack=new Stack<>();
	public static void push(int x)
	{
	stack.push(x);
	System.out.println(stack.peek());
		
	}
	
	public static void pop()
	{
        stack.pop();
        if(!stack.isEmpty())
		System.out.println(stack.peek());
        else
            System.out.println("EMPTY");
	}
	
	public static void inc(int x,int count)
	{
		Stack<Integer> temp=new Stack<>();
		while(!stack.isEmpty())
			temp.push(stack.pop());
		
		for(int i=0;i<count;i++)
		{
			int a=temp.pop();
			stack.push(a+x);
		}
		
		while(!temp.isEmpty())
			stack.push(temp.pop());
		
		System.out.println(stack.peek());
	
	}
	
	
	public static void main(String ar[])
	{
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<count;i++)
		{
			String line=scan.nextLine();
			System.out.println("  --" +line);
			if(line.contains("push"))
				push(Character.getNumericValue(line.charAt(line.length()-1)));
			else if(line.contains("pop"))
				pop();
			else
				inc(Character.getNumericValue(line.charAt(line.length()-1)),Character.getNumericValue(line.charAt(line.length()-3)));
				
		
		}
	}
	
}