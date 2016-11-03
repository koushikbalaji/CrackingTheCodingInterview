package CareerCup;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {

	static Node root;
	static List<Integer> inOrder=new ArrayList<Integer>();
	
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
		
		void inOrder(Node root)
		{
			if(root==null)
				return;
			
			System.out.println(root.data);
			inOrder(root.left);
			inOrder(root.right);
			
			
		}
		
		public void constructTree(List<Integer> pre)
		{
			if(pre==null)
				return;
			
			Stack<Node> stack=new Stack<Node>();
			root=new Node(pre.get(0));
			stack.push(root);
			
			for(int i=1;i<pre.size();i++)
			{
				
				Node temp=null;
				
				while(!stack.isEmpty()&&pre.get(i)>stack.peek().data)
					temp=stack.pop();
				
				if(temp!=null)
				{
					temp.right=new Node(pre.get(i));;
					stack.push(temp.right);
					
				}
				
				else
				{
					temp=stack.peek();
					temp.left=new Node(pre.get(i));
					stack.push(temp.left);
				}
				
				
			}
			
			
			
			
		}
		
		public void constructBinaryTree(List<Integer> pre)
		{
			
			if(pre==null)
				return;
			
			Queue<Node> queue=new LinkedList<Node>();
			root=new Node(pre.get(0));
			queue.offer(root);
			
			int i=1;
			while(!queue.isEmpty()&&i<pre.size()-1)
			{
				
				Node temp=queue.poll();
				
				if(temp==null)
					continue;
				
				if(pre.get(i)!=-1)
					{
					temp.left=new Node(pre.get(i));
					queue.offer(temp.left);
					}
				
				else
				{
					temp.left=null;
					queue.offer(null);
				}
				
				if(i<pre.size()-1)
				i++;
				else
					return;
				

				if(pre.get(i)!=-1)
					{
					temp.right=new Node(pre.get(i));
					queue.offer(temp.right);
					}
				
				else
				{
					temp.right=null;
					queue.offer(null);
				}
				
				
			}
			
		}
		
		
		public int maxLevel(Node root,int level,int n)
		{
			if(root==null)
				return level;
			
			if(level==n)
				System.out.println(root.data);
			
			maxLevel(root.left,++level,n);
			maxLevel(root.right,++level,n);
			
			return level;
		}
		
		public int findLevel(Node root,int level,int data)
		{
			if(root==null)
				return 0;
			
			if(root.data==data)
				return level;
			
			int currLevel=findLevel(root.left,level+1,data);
			if(currLevel>0)
				return currLevel;
				
			currLevel=findLevel(root.right,level+1,data);
			
			return currLevel;
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst=new BinarySearchTree();
		root=bst.new Node(10);
		bst.add(root, bst.new Node(1));
		bst.add(root, bst.new Node(5));
		bst.add(root, bst.new Node(7));
		bst.add(root, bst.new Node(40));
		bst.add(root, bst.new Node(50));
		
		System.out.println(bst.findLevel(root,0,100));
		
		/*List<Integer> pre=new ArrayList<Integer>();
		pre.add(20);
		pre.add(8);
		pre.add(-1);
		pre.add(-1);
		pre.add(22);
		pre.add(-1);
		pre.add(-1);
		
		
		bst.constructBinaryTree(pre);
		
		bst.inOrder(root);*/
		
		
	}

}
