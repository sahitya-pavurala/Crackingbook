/*
Program to check if a linked list a palindrome
*/
import java.util.*;



class LinkedListPalindrome
{
	Node first;

	class Node
	{
		Node next;
		int value ;
	}

	public boolean isEmpty()
	{
		return(first == null);
	}

	public void push(int value)
	{
		Node oldfirst = first;
		Node newNode =  new Node();
		newNode.value = value;
		newNode.next = oldfirst;
		first = newNode;
	}

	public int pop()
	{	

		int result = 0;
		if(this.isEmpty() == false)
		{
			result = first.value;
			first = first.next;
		}
		else
			System.out.println("The stack is empty");
			
		return result;
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

	public static boolean isPalindrome(LinkedListPalindrome ob)//boolean method returns true if the linked list is a palindrome 
	{
		int size = ob.size();
		Node p1 = ob.first;
		Deque<Integer> compareStack = new ArrayDeque<Integer>();
		if(size % 2 != 0)//odd number of elements
		{
			Node p2 = ob.first;
			while(p2.next != null)
			{
				compareStack.push(p1.value);
				p1 = p1.next;
				p2 = p2.next.next;
			}
			p1 = p1.next;
		}
		else
		{
			Node p2 = ob.first;
			while(p2.next.next != null)
			{
				compareStack.push(p1.value);
				p1 = p1.next;
				p2 = p2.next.next;
			}
			compareStack.push(p1.value);
			p1 = p1.next;
		}
		while(p1.next != null)
		{ 
			if(p1.value != compareStack.pop())
				return false;
			p1 = p1.next;	
		}
		return true;
	}

	public static void main(String[] args)
	{
		LinkedListPalindrome ob = new LinkedListPalindrome();

		ob.pop();//popping from empty stack

		ob.push(1);
		ob.push(2);
		ob.push(3);
		ob.push(4);
		ob.push(4);
		ob.push(3);
		ob.push(2);
		ob.push(1);
		if(isPalindrome(ob))
			System.out.println("The Linked list is a palindrome");
		else
			System.out.println("The Linked list is not a palindrome");
	}

} 
