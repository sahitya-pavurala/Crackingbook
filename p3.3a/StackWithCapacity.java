/*
This program is an implementation of 
a Stack which has a treshold value, which when reached
a new stack is created automatically
*/

import java.util.*;


class Stacks
{
	Node first;
	int capacity;


	class Node
	{
		Node next;
		int value;
	}

	void display()
	{
		Node pre = first;
		while(pre.next != null)
		{
			System.out.println(pre.value);
			pre = pre.next;
		}
		System.out.println(pre.value);
	}
}
class StackWithCapacity
{
	ArrayList<Stacks> stacks = new ArrayList<Stacks>();
	


	
	public void push(int value)
	{
		Stacks stack = getLastStack();
		if(stack.capacity == 5 )
		{	
			stack.display();
			System.out.println("Creating new Stack");
			stack = new Stacks();
		}
		Stacks.Node oldfirst = stack.first;
		stack.first =  stack.new Node();
		stack.first.value = value;
		stack.first.next = oldfirst;
		stack.capacity++;
		stacks.add(stack);				
	}

	public Stacks getLastStack()
	{
		if(stacks.size() != 0)
			return stacks.get(stacks.size()-1);
		Stacks stack = new Stacks();
		return stack;
	}

	public int pop()
	{	
		Stacks stack = getLastStack();
		int result = 0;
		if(stack.capacity == 1)
		{
			result = stack.first.value;
			stack.first = stack.first.next;
			stacks.remove(stack);

		}
		else if(stack.capacity == 0)
			{System.out.println("The stack is empty");}
		else 
			result = stack.first.value;
			stack.first = stack.first.next;
			stack.capacity--;

		return result;
	}
	


	public static void main(String[] args)
	{

		StackWithCapacity obj = new StackWithCapacity();

		//obj.pop();//popping from empty stack

		obj.push(10);
		obj.push(8);
		obj.push(8);
		obj.push(7);
		obj.push(8);
		
		obj.push(4);
		obj.push(3);
		obj.push(2);
		obj.push(8);
		obj.push(1);
		obj.pop();
		obj.push(40);

		obj.push(11);


	}

} 
