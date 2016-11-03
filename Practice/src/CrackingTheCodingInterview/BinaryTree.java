package CrackingTheCodingInterview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	
	static Node root;
	
	class Node
	{
		Node left;
		Node right;
		int data;
		Node(int data)
		{
			this.data=data;
		}
		
		
	}
	
	void leftSideView(Node root)
	{
		ArrayList<Node> leftView=new ArrayList<Node>();
		leftSideViewHelper(root, leftView,0);
		
		for(Node a:leftView)
			System.out.println(a.data);
		
		
	}
	
	void leftSideViewHelper(Node root,ArrayList<Node> list,int depth)
	{
		if(root==null)
			return;
		
		
		if(depth==list.size())
			list.add(root);
		
		
		leftSideViewHelper(root.left, list, depth+1);
		leftSideViewHelper(root.right, list,depth+1);
		
		
	}
	
	void topView(Node root)
	{
		Queue<Node> left=new LinkedList<>();
		Queue<Node> right=new LinkedList<>();
		topViewHelper(root, left, right);

		System.out.println(root.data);
		for(Node node:left)
			System.out.println(node.data);
		
		for(Node node:right)
			System.out.println(node.data);
	}
	
	void topViewHelper(Node curr,Queue<Node> left,Queue<Node> right)
	{
		if(curr==null)
			return;
		
		left.add(curr.left);
		left.add(curr.right);
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree=new BinaryTree();
		root=tree.new Node(1);
		root.left=tree.new Node(2);
		root.right=tree.new Node(3);
		root.left.right=tree.new Node(5);
		root.right.right=tree.new Node(4);
		root.right.right.left=tree.new Node(6);
		
		//tree.leftSideView(root);
		String s="sdDD";
		int counter=0;
        for(int i=0;i<s.length();i++)
            {
            if((s.charAt(i)>=65)&&(new Integer(s.charAt(i))<=90))
                counter++;
        }
        System.out.println(counter+"1");
        System.out.println(new Integer(s.charAt(2))+" "+Character.getNumericValue('a'));
		System.out.println();
		
		
	}

}
