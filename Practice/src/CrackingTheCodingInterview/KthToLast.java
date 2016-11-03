package CrackingTheCodingInterview;

public class KthToLast {
	
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
		}
	
	class LinkedList
	{
		Node head,tail;
		int size=0;
		
		void add(int data)
		{
			Node curr=new Node(data);
			if(head==null)
			{
				head=tail=curr;
				size++;
				return;
			
			}
			tail.next=curr;
			tail=curr;
			size++;
			
			
		}
		
		int remove(int position)
		{
			int index=0;
			if(position>=size) //0 base position
				return -1;
			
			Node curr=null;
			if(position==0)
			{
				curr=head.next;
				head.next=null;
				head=curr;
			}
			
			
			curr=head;
			Node prev=null;
			for(index=1;index<=position;index++)
			{
				prev=curr;
				curr=curr.next;
			}
			
			prev.next=curr.next;
			if(position==size-1)
				tail=prev;
			
			
			return curr.data;
		}
		
		void printList()
		{
			Node curr=head;
			while(curr.next!=null)
			{
				System.out.print(curr.data+" ");
				curr=curr.next;
			}
			System.out.print(curr.data);
		}
	}
	
	
	public static void main(String ar[])
	{
		
		LinkedList obj=new KthToLast().new LinkedList();
		
		for(int i=0;i<10;i++)
			obj.add(i);
		
		//obj.printList();
		
		System.out.println(obj.remove(5));
		
		obj.printList();
		
	}

}
