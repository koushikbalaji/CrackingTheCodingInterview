package CareerCup;

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

public class IdenticalTrees {

	public Boolean checkTree (Node root1,Node root2)
	{
		if(root1==null&&root2==null)
			return true;
		
		if(root1!=null&&root2!=null)
			return (root1.data==root2.data&&checkTree(root1.left,root2.left)&&checkTree(root1.right,root2.right));
		
		return false;
	}
	
	
	
}
