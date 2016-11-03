package CrackingTheCodingInterview;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedians {

	public static void findMedian(int[] arr) {

		int n = arr.length;

		if (n == 0)
			System.out.println(-1);
		if (n == 1)
			System.out.println(arr[0]);

		double median = 0.0;
		double curr = 0;

		PriorityQueue<Double> min = new PriorityQueue<>(n / 2);
		PriorityQueue<Double> max = new PriorityQueue<>(n / 2, Collections.reverseOrder());

		median = arr[0];
		min.add(median);
		System.out.println(median);

		for (int i = 1; i < n; i++) {

			curr = arr[i];

			if (curr <= median)
				max.add(curr);
			else
				min.add(curr);

			if (Math.abs(min.size() - max.size()) > 1) {
				if (min.size() > max.size())
					max.add(min.poll());
				else
					min.add(max.poll());
			}
			
			if (min.size() == max.size())
				median = (min.peek() + max.peek()) / 2;
			else
				median = min.size() > max.size() ? min.peek() : max.peek();

			System.out.println(median);

		}

	}

	public static void main(String ar[]) {
		int[] arr = { 12, 4, 5, 3, 8, 7 };
		findMedian(arr);
	}

}
