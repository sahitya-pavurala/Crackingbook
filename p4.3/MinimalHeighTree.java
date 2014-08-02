import java.util*;


class MinimalHeightTree{

	private Node root;
	class Node
	{
		Node left;
		Node right;
		int value;
		Node(value)
		{
			left = null;
			right= null;
			value = value;
		}
	}

	Node constructMinTree(int[] elements,int start,int end)
	{
		if(start>end)
			return null;
		int mid = start+end/2;
		Node n = new Node(elements[mid]);
		n.left = constructMinTree(elements,start,mid-1);
		n.right = constructMinTree(elements,mid+1,end);	
		return n;
	}
	
	Node constructMinTree(int[] elements)
	{
		return constructMinTree(elements,0,elements.length-1);
	}

}
