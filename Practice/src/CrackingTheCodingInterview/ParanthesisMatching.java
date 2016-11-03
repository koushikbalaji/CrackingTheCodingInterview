package CrackingTheCodingInterview;

import java.util.Stack;

public class ParanthesisMatching {

	public static boolean isBalanced(String expression) {

		if (expression == null)
			return true;
		if (expression.length() == 1)
			return false;

		Stack<Character> stack = new Stack<Character>();

		char curr;
		for (int i = 0; i < expression.length(); i++) {
			curr = expression.charAt(i);
			if ((curr == '{') || (curr == '[') || (curr == '('))
				stack.push(curr);

			else {
				if (curr == '}')
					curr = '{';
				if (curr == ']')
					curr = '[';
				if (curr == ')')
					curr = '(';
				if (stack.isEmpty() || curr != stack.pop())
					return false;
			}
		}

		if (!stack.isEmpty())
			return false;

		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isBalanced("{}"));

	}

}
