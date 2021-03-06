/*
This program will return 
the kth to last element
*/


import java.util.*;


class  BadMyLinkedList
{
	private Node first;

	class Node
	{
	 	Node next;
	 	int data;
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
			n.data = element;
			first = n;
		}
		else
		{

			Node newNode = new Node();
			newNode.data = element;
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

	public int find(int k)// returns kth to the last element 
	{	
		int sizeoflk = size();
		//System.out.println(sizeoflk);
		Node n = first;
		int delim = sizeoflk - k +1 ;
		for(int i = 1 ; i < delim ; i++)
		{
			n = n.next;
		}

		return n.data;
	}

	public static void main(String[] args)
	{
		BadMyLinkedList lnklst = new MyLinkedList();
		lnklst.insert(8);
		lnklst.insert(10);
		lnklst.insert(5);
		lnklst.insert(7);
		lnklst.insert(2);
		lnklst.insert(1);
		lnklst.insert(5);
		lnklst.insert(4);
		lnklst.insert(10);
		lnklst.insert(10);

		System.out.println("The 7th to the last element is :" + lnklst.find(7));
		System.out.println("The 3rd to the last element is :" + lnklst.find(3));
		System.out.println("The 4th to the last element is :" + lnklst.find(4));
		System.out.println("The 6th to the last element is :" + lnklst.find(6));
		

	}
}
