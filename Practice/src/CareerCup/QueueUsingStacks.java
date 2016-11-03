package CareerCup;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStacks {
	static class MyQueue<Integer> {

		Stack<Integer> one;
		Stack<Integer> two;

		MyQueue() {
			one = new Stack<Integer>();
			two = new Stack<Integer>();

		}

		public void enqueue(Integer in) {
			one.push(in);

		}

		public void dequeue() {
			if (two.isEmpty()) {
				while (!one.isEmpty())
					two.push(one.pop());
			}

			two.pop();

		}

		public Integer peek() {
			if (two.isEmpty()) {
				while (one.isEmpty())
					two.push(one.pop());
			}

			return two.peek();

		}

	}

	public static void main(String[] args) {
		MyQueue<Integer> queue = new MyQueue<Integer>();

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int operation = scan.nextInt();
			if (operation == 1) { // enqueue
				queue.enqueue(scan.nextInt());
			} else if (operation == 2) { // dequeue
				queue.dequeue();
			} else if (operation == 3) { // print/peek
				System.out.println(queue.peek());
			}
		}
		scan.close();
	}
}
