import java.util.*;
/*
This program will divide a linked based on a value x
all the data node less than x will come before all the nodes that are greater 
than x
*/

class  LinkedListDivide
{
	private Node first;

	class Node
	{
	 	Node next;
	 	int value;
	}

	public boolean isEmpty()
	{
		return first == null;
	}

	public void insert(int element)
	{	
		if(this.isEmpty())
		{
			Node n = new Node();
			n.value = element;
			first = n;
		}
		else
		{

			Node newNode = new Node();
			newNode.value = element;
			Node n = this.first;
			while(n.next != null)
			{
				n = n.next;
			}	
			n.next = newNode;
		}

	}

	public int size()
	{
		int counter = 1;
		Node n = first;
		while(n.next != null)
		{
			n = n.next;
			counter++;
		}

		return counter;
	}
	
	public static void Display(LinkedListDivide lnklst)
	{
		Node p = lnklst.first;
		while(p != null)
		{
			System.out.println(p.value);
			p = p.next;
		}
	}
	
	public static void Divide(LinkedListDivide lnklst,int x)
	{
		Node p1 = lnklst.first;//pointer to the current head
		Node p2 = lnklst.first.next;//pointer to the heads next
		while(p1.next != null)
		{	
			p1 = p1.next;
		}
		
		Node p3 = p1;//pointer to hold the while limit
		Node p4 = p1;//pointer to hold the last pointer
		p1 = lnklst.first;
		Node temp = p1;;
		while(p1 != p3)
		{
			 
			if(p1.value > x)
			{
				if(p1 == lnklst.first)
				{
					lnklst.first = p1.next;
					p4.next = p1;	
					p1.next = null;
					p1 = lnklst.first;
					p2 = p1.next;
					p4 = p4.next;
				}	
				else
				{
					p4.next = p1;	
					p1.next = null;
					p4 = p4.next;
					temp.next = p2;
					p1 = p2; 
					p2 = p2.next;
				}
			}

			else
			{ 
				temp = p1;//changes every time when p1 changes
				p1 = p1.next;
				p2 = p2.next;
			}
		}
		
	}


	public static void main(String[] args)
	{
		LinkedListDivide lnklst = new LinkedListDivide();
		lnklst.insert(20);		
		lnklst.insert(1);
		lnklst.insert(6);
		lnklst.insert(4);
		lnklst.insert(7);
		lnklst.insert(8);
		lnklst.insert(3);
		lnklst.insert(11);
	
		System.out.println("Before \n");
		Display(lnklst);//before
		
		System.out.println("After \n");
		Divide(lnklst,5);
		Display(lnklst);//after

	}

}
