
public class SrikaTest {

	public void check1()
	{
		int a[]=new int[1];
		a[0]=0;
		
		check2(a);
		System.out.println(a[0]);
		
	}
	public void check2(int[] a)
	{
		a[0]++;
	}
	public static void main(String ar[])
	{
//		long start=System.currentTimeMillis();
//		int j=0;
//		for(int i=0;i<100000000/2;i++)
//		{			j=j+1;
//			j=j+1;
//		}
//		System.out.println(System.currentTimeMillis()-start);
		new SrikaTest().check1();
	}
	
	
	
}
