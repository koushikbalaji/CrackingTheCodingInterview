package Indeed;

import java.util.LinkedList;
import java.util.Scanner;

public class SuperStack {

	static LinkedList<Integer> stack=new LinkedList<Integer>();
	
	public static void pop()
	{
		
		stack.removeLast();
		if(stack.isEmpty())
			System.out.println("EMPTY");
		else
			System.out.println(stack.getLast());
	}
	
	public static void push(int x)
	{
		
		stack.addLast(x);
		System.out.println(stack.getLast());
		
	}
	
	public static void inc(int x,int count)
	{
		if(stack.size()==0||stack.size()<count)
		{
			System.out.println("EMPTY");
			return;
		}
		
		for(int i=0;i<count;i++)
		{
			
			int a=stack.get(i);
			stack.set(i, a+x);
		}
		
		System.out.println(stack.getLast());
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
