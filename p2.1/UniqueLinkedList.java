/*
This program will remove the duplictes present
in the linked list
*/
import java.util.*;





class UniqueLinkedList
{
	private Node first;

	private class Node
	{
		Node next;
		int data;
	}
	
	void insertAtEnd(int element)
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

	void insertAtBeginning(int element)
	{
		if(this.first != null)
		{
		Node newNode = new Node();
		newNode.data = element;
		Node oldFirst = this.first;
		this.first = newNode;
		newNode.next = oldFirst;
		}
		else
		{
			Node newNode = new Node();
			newNode.data = element;
			first = newNode;
		}
	}

	void removeDuplicates()
	{
		Hashtable checker = new Hashtable();
		Node n = this.first;
		Node previous = null;
		while(n != null)
		{
			if(checker.containsKey(n.data))
			{
				previous.next =  n.next ;
			}
		  	else
			{
				checker.put(n.data,true);
				previous = n ;
			}
			n = n.next;
		}
	}

	public void display()
	{
		Node n = this.first;
		while(n.next != null)
		{
			System.out.println(n.data);
			n = n.next;
		}
	}

	public static void main(String[] args)
	{
		UniqueLinkedList linkLst = new UniqueLinkedList();

		linkLst.insertAtBeginning(1);
		linkLst.insertAtEnd(2);
		linkLst.insertAtEnd(3);
		linkLst.insertAtEnd(4);
		linkLst.insertAtEnd(4);
		linkLst.insertAtEnd(2);
		linkLst.insertAtEnd(5);
		linkLst.insertAtEnd(6);
		System.out.println("The linked list now contains: ");
		linkLst.display();

		linkLst.removeDuplicates();
		System.out.println("The linked list after removing duplicates contains: ");

		linkLst.display();


	}
}