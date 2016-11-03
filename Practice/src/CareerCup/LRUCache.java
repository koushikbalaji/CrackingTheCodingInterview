package CareerCup;

import java.util.HashMap;

public class LRUCache {

	Node head, tail;
	int size;
	HashMap<Integer, Node> cache;

	public LRUCache(int size) {
		this.size = size;
		cache = new HashMap<Integer, Node>();

	}

	class Node {
		Node next;
		Node prev;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	public int get(int key) {

		Node node = cache.get(key);
		
		
		if (node==null) {
			return -1;
		}
		
		setHead(node);
		return node.data;
	}

	public void setHead(Node node)
	{
		
		
		
		
	}
	
	public void set(int key, int value) {

		Node node=new Node(value);
		if(cache.containsKey(key))
		{
			cache.put(key, node);
			setHead(node);
			
		}
		
		if(cache.size()==0)
		{
			cache.put(key, node);
			head=tail=node;
			return;
		}
		if(cache.size()!=size)
		{
			
		}
		
	}

}
