class NumSteps2 {
	public static long Count(int n,long[] check) {
		if(n < 0)
			return 0;
		else if( n == 0)
			return 1;
		else
		{
			if(check[n] > -1)
				return check[n];

			check[n] = Count(n-1,check) + Count(n-2,check) + Count(n-3,check);
		}

		return check[n];

	}

	public static void main(String[] args) {
		int n = 100;
		long[] check = new long[n+1];
		for (int i = 0 ; i <= n ; i++)
			check[i] = -1;
		System.out.println("the number of paths is : " + Count(n,check));
	}
}