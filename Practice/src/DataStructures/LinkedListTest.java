package DataStructures;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	
/*	class Node
	{
		
		int data;
		Node next;
	}
	
	class LinkedList
	{
		Node head;
		Node tail;
		
		public LinkedList(int size)
		{
			
		}
		
		public LinkedList()
		{
			new 
		}
		
		
	}*/

	public static void main(String ar[])
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		Iterator<Integer> it=list.iterator();
		
		int i=-1;
		while(it.hasNext())
		{
			//i++;
			if(it.next()==3)
			{
				it.remove();
			}
			
		}
		
		
		System.out.println(list);
	}
	
	
}
