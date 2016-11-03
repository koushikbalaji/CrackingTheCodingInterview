package CareerCup;

import java.util.Stack;

import javax.xml.stream.events.Characters;

public class ReversePolish {

	public int computeExpression(char[] expr)
	{
		Stack<Character> operators=new Stack<Character>();
		Stack<Integer> operands=new Stack<Integer>();
		
		
		for(int i=0;i<expr.length;i++)
		{
			
			if(expr[i]=='+'||expr[i]=='-'||expr[i]=='*'||expr[i]=='/')
				operators.push(expr[i]);
			else
				operands.push((Character.getNumericValue(expr[i])));
			
			
		}
		
		int a=0,b=0,result=0;
		char curr;
		
		while(!operators.isEmpty()&&!operands.isEmpty())
		{
			
			a=operands.pop();
			if(!operands.isEmpty())
				b=operands.pop();
			
			curr=operators.pop();
			
			switch(curr)
			{
			case '+':
				result=a+b;
				break;
			case '-':
				result=a-b;
				break;
			case '*':
				result=a*b;
				break;
			case '/':
				result=a/b;
				break;
			
			}
			
			
			operands.push(result);
			
			
			
		}
		
		
		return result;
	}
	
	public static void main(String ar[])
	{
		
		int result=new ReversePolish().computeExpression("1+2*3".toCharArray());
		System.out.println(result);
		
		
	}
	
}
