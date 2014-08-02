/*
This program will return 
the kth to last element
*/


import java.util.*;


class  MyLinkedList
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
		Node p1 = first;
		int count = 1;
		while(count != k)
		{
			p1 = p1.next;
			count++ ;
		}
		Node p2 = p1;
		p1 = first;
		while(p2.next != null)
		{
			p1 = p1.next;
 			p2 = p2.next;
		}
		return p1.data;
	}

	public static void main(String[] args)
	{
		MyLinkedList lnklst = new MyLinkedList();
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
