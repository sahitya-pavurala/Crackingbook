/*
This program is an implementation of 
a Stack which has a min function along with push and 
pop, Also all three function operate in O(1) time
*/

import java.util.*;

class StackWithMin
{
	Node first;

	class Node
	{
		Node next;
		int value ;
		int min; 
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

		if (first.next == null )
			first.min = first.value;
		
		else if(newNode.value < oldfirst.min)
			newNode.min = newNode.value;
	
		else
			newNode.min = oldfirst.min;
		
		

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

	public int min()
	{
		return first.min;
	}

	public static void main(String[] args)
	{
		StackWithMin ob = new StackWithMin();

		ob.pop();//popping from empty stack

		ob.push(10);
		System.out.println("This minimum of the stack is :" + ob.min());
		ob.push(8);
		System.out.println("This minimum of the stack is :" + ob.min());
		ob.push(7);
		System.out.println("This minimum of the stack is :" + ob.min());
		ob.push(9);
		System.out.println("This minimum of the stack is :" + ob.min());
		ob.pop();
		ob.pop();
		System.out.println("This minimum of the stack is :" + ob.min());

	}

} 

