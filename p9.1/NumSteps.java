


class NumSteps{

	public static long Count(int n)
	{
		long[] check = new long[n+1];
		check[1] = 1;
		check[2] = 2;
		check[3] = 4;
		for(int i = 4 ; i < n+1 ; i++)
		{
			check[i] = check[i-1] + check[i-2] + check[i-3];
		}
		
		return check[n];
	}



	public static void main(String[] args)
	{
		int n = 100;
		System.out.println("the number of paths is : " + Count(n));

	}

}