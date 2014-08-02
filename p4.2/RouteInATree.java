import java.util.*;


class RouteInATree{
	
	private Node root;	

	class Node
	{
		Node left;
		Node right;
		int value;
		int state;
		Node(value)
		{
			right = null;
			left = null;
			value = value;
		}
	}

boolean routeFind(Graph g,Node start, Node end)
{
	LinkedList<Node> queue = new LinkedList<Node>(); 	
	
	for(Node i : g.getNodes())
	{
		i.state = -1;//univisited
	}
	
	queue.enque(start);
	start.state = 0//visiting
	Node u = start;
	while(!queue.isEmpty())
	{
		u = queue.remove();
		if(u != null)
		{
			for(Node v : u.getAdjacent())
			{
				if(v.state == -1)
				{	
					if(v == end)
						return true;
					else
					{
						v.state = 0;
						queue.add(v);
					}
				}
			}
		}
		u.state = 1;//visited
	}
	return false;
}		


}
