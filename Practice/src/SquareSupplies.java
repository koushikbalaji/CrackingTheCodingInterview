
public class SquareSupplies {
	
	public static int answer(int n)
	{
		int factor = 0;
		int counter = 0;
		int leftOver = 1;
		int remaining = n;
			while (remaining > 0)
				{
				leftOver = 0;
				factor = 1;
				while (leftOver <= remaining)
					{
					leftOver = factor * factor; 
					factor = factor + 1;
					}
				leftOver = (factor - 2) * (factor - 2);
				remaining = remaining - leftOver;
				counter = counter + 1;
				}
		return counter;
	}
	public static void main(String ar[])
	{
		System.out.println(answer(12));
		}
}
