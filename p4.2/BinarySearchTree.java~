import java.util.*;


class BinarySearchTree
{
	private Node root;

	
	class Node
	{
		Node left;
		Node right;
		int value;
		Node(value)
		{
			left = null;
			right = null;
			value = value;
		}

	}

	public BinarySearchTree()
	{
		root = null;
	}
	
	public boolean lookup(int value)
	{
		return (lookup(root,value));
	}
	
	private boolean loopkup(Node node,int value)
	{
		if(node == null)
			return false
		if(value == node.value)
			return true;
		else if(value < node.value)
			return lookup(node.left, value);			
		else
			return loopkup(node.right,value);	
	}
	
	public void insert(int value)
	{
		root = insert(root,value)
	}

	private Node insert(Node node,int value)
	{
		if(node == null)
			node =  new Node(value);
		else if(value <= node.value)
			node.left = insert(node.left,value);
		else
			node.right = insert(node.right,value);
		return node;
	}	
	public int checkHeight(Node node)
	{
		if(node == root)
			return 0;
		
		int leftHeight = checkHeight(node.left);
		if (leftHeight == -1)
			return -1;
		
		int rightHeight = checkHeight(node.right);
		if (rightHeight == -1)
			return -1;

		int heightDiff = leftHeight - rightHeigt;
		if(Mah,abs(heightDiff) > 1)
			return -1;
	
		else
		{	
			return Math.max(leftHeight,rightHeight) + 1;
		}

	} 
	
	public static boolean isBST(Node node)
	{	
		if(checkHeight(node) == -1)
			return false;
		
		else
			return true;
	}
}
