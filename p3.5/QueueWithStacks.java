import java.util.*;


class QueueWithStacks
{
	Deque<Integer> stack1 = new ArrayDeque<Integer>();
	Deque<Integer> stack2 = new ArrayDeque<Integer>();
	
	public void enqueue(int data)
	{
		if(stack1.isEmpty() && stack2.isEmpty())
			stack1.push(data);
		else if (!stack1.isEmpty())
			stack1.push(data);
		else 
			{
				while(!stack2.isEmpty())	
				{
					stack1.push(stack2.pop());
					stack1.push(data);
				}
			}
	}
	public int dequeue()
	{
		if(stack1.isEmpty())
			return stack2.pop();
		else	
		{
			while(stack1.size() != 1)
			{
				stack2.push(stack1.pop());
			}
		}
		
		
		return stack1.pop();
	}
	
	
	public static void main(String[] args)
	{
		QueueWithStacks ob = new QueueWithStacks();
		int result = 0;

		ob.enqueue(1);
		ob.enqueue(2);
		result = ob.dequeue();//1
		System.out.println(result);
		
		result = ob.dequeue();//2
		System.out.println(result);
		
		
		ob.enqueue(3);
		result = ob.dequeue();//3
		System.out.println(result);

		ob.enqueue(4);
		ob.enqueue(5);
		result = ob.dequeue();//4
		System.out.println(result);
		ob.enqueue(6);
		ob.enqueue(7);
		result = ob.dequeue();//5
		System.out.println(result);
		ob.enqueue(8);
		ob.enqueue(9);
		result = ob.dequeue();//6
		System.out.println(result);
		

	}
}

