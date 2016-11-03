import java.util.Stack;

public class TopView {

	public static void main(String ar[])
	{
		
	}
	static class Node
	{
		int data;
		Node left;
		Node right;
	}
	void top_view(Node root)
	{
	  if(root.left==null||root.right==null)
	      return;
	    Node temp=root;
	    Node temp2;
	    Stack<Node> left=new Stack<>();
	    Stack<Node> right=new Stack<>();
	    while(root.left!=null)
	        left.push(root.left);
	    
	     while(temp.right!=null)
	       right.push(root.left);
	  
	    while(!left.isEmpty())
	    {
	    	temp2=left.pop();
	    	System.out.print(temp2.data);
	    }
	}
}
