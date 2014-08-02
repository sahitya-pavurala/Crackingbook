import java.util.*;


class LinkSum
{
	public static LinkedList<Integer> Linksum(LinkedList<Integer> l1,LinkedList<Integer> l2)
	{
		int size = l1.size();
		int excess = 0;
		LinkedList<Integer> result = new LinkedList<Integer>();
		for(int i = 0; i < size ;i++)
		{
			int a = l1.get(i);
			int b = l2.get(i);
			int c = a+b+ excess ;
			result.add(c % 10);
			excess = c /10 ;
		}
			result.add(excess);
		return result;
	}


	public static void main(String[] args)
	{
		LinkedList<Integer> l1 = new LinkedList<Integer>();
      		// add elements to the linked list
      		l1.add(7);
      		l1.add(1);
      		l1.add(8);
		l1.toArray();
		
		LinkedList<Integer> l2 = new LinkedList<Integer>();
      		// add elements to the linked list
      		l2.add(5);
      		l2.add(9);
      		l2.add(2);

		LinkedList<Integer> result = Linksum(l1,l2);
		result.toArray();
		for(int i : result)
			{System.out.println(i);}

	}
}
