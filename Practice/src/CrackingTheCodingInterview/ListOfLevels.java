package CrackingTheCodingInterview;

import java.util.ArrayList;
import java.util.LinkedList;


public class ListOfLevels {
	
	static Node root;
	
	class Node
	{
		Node left;
		Node right;
		int data;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	public void add(Node root,Node curr)
	{
		
			
		if(root.data<=curr.data)
		{
			if(root.right!=null)
			{
			root=root.right;
			add(root,curr);
			}
			else
				root.right=curr;
			
		}
		
		else
		{
			if(root.left!=null)
			{
			root=root.left;
			add(root,curr);
			}
			else
				root.left=curr;
		}
		
	
	}

	public static ArrayList<LinkedList<Node>> ListOfLevelsUtil(Node root)
	{
		
		ArrayList<LinkedList<Node>> lists=new ArrayList<>();
		ListOfLevelsUtil(root,lists,0);
		return lists;
		
	}
	
	public static void ListOfLevelsUtil(Node root,ArrayList<LinkedList<Node>> lists,int level)
	{
		
		if(root==null)
			return;
		
		LinkedList<Node> list=null;
		if(lists.size()==level)
		{
			list=new LinkedList<>();
			lists.add(list);
		}
		else
		{
			list=lists.get(level);
		}
		
		list.add(root);
		
		ListOfLevelsUtil(root.left,lists,level+1);
		ListOfLevelsUtil(root.right,lists,level+1);
		
		
		
	}
	
	
	public static void main(String ar[])
	{
		ListOfLevels bst=new ListOfLevels();
		root=bst.new Node(10);
		bst.add(root, bst.new Node(1));
		bst.add(root, bst.new Node(5));
		bst.add(root, bst.new Node(7));
		bst.add(root, bst.new Node(40));
		bst.add(root, bst.new Node(50));
		
		ArrayList<LinkedList<Node>> lists=ListOfLevelsUtil(root);
		for(LinkedList list:lists)
			for(Object data:list)
				System.out.println((Node)data);
		
		
		
	}
	
}
