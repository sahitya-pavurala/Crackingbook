/*
This program will reverse the linked list
*/
import java.util.*;





class ReverseLinkedList
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


	public void display()
	{
		Node n = this.first;
		while(n.next != null)
		{
			System.out.println(n.data);
			n = n.next;
		}
		
		System.out.println(n.data);
	}

	public void reverse()
	{
		Node nextHead = first.next;
		first.next = null;
		Node pre = first;
		Node current = null;
		while(nextHead.next != null)
		{
			current = nextHead;
			nextHead = current.next;
			current.next = pre;
			pre = current;
		}
		
		this.first = nextHead;
		first.next = pre;
		
	}

	public static void main(String[] args)
	{
		ReverseLinkedList linkLst = new ReverseLinkedList();

		linkLst.insertAtBeginning(1);
		linkLst.insertAtEnd(2);
		linkLst.insertAtEnd(3);
		linkLst.insertAtEnd(4);
		linkLst.insertAtEnd(5);
		linkLst.insertAtEnd(6);
		linkLst.insertAtEnd(7);
		linkLst.insertAtEnd(8);
		System.out.println("The linked list element are now in this order: ");
		linkLst.display();

		linkLst.reverse();
		System.out.println("The linked list after reversing are in this order: ");

		linkLst.display();


	}
}
