import java.util.*;
import java.util.Stack<E>;

class StackSort
{
	
	
	public static void Display(Deque<Integer> stack)
	{
		int count = 0;
		while(count != stack.size())
		{
			System.out.println(stack.get(count));
			count++;
		}
	}
	
	public static void Sort(Deque<Integer> stack,Deque<Integer> stack2)
	{
		int min = stack.pop();
		stack2.push(min);
		while(!stack.isEmpty())
		{
			if(stack.peek() > min)
			{
				min = stack.pop();
				stack2.push(min);
			}
			else
			{
				int currentmin = stack.pop();
				while(!(currentmin > min))
				{	
					min = stack2.pop();
					stack.push(min);
				}
				stack2.push(currentmin);
				min = stack2.peek();
			}	
		}
	}

	public static void main(String[] args)
	{
		Deque<Integer> stack1 = new ArrayDeque<Integer>();
		stack1.push(2);
		stack1.push(8);
		stack1.push(4);
		stack1.push(11);
		stack1.push(20);
		stack1.push(5);
		stack1.push(1);
		
		Deque<Integer> stack2 = new ArrayDeque<Integer>();		
		Display(stack1);
		
		Sort(stack1,stack2);

		Display(stack2);
		

	}
}

