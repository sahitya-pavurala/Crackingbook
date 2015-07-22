
class Paths{

	public static boolean findPath(x,y)
	{

		HashMap<Point,Boolean> check = new HashMap<Point,Boolean>() ;
		if(check.containsKey(Point(x,y)))
			return check.get(Point(x,y))

		//base cases
		if(x < 0 || y < 0)
			return false;

		if(x == 0 && y == 0)
			return true;

		boolean success = false;
		else{
			//go left
			if(isValid(x-1,y))
				success = findPath(x-1,y);

			//go up	
			if(!success and isValid(x,y-1))
				success = findPath(x,y-1);

			if (success)
				paths.add(Point(x,y));
			
			check.add(Point(x,y),success)
			return success;



		}


	}

	public static void main(String[] args)
	{

		int x = 10;
		int y = 4;
		ArrayList<int> paths = new ArrayList<int>();

		System.out.println("the number of paths is : " paths.size;

	}
}