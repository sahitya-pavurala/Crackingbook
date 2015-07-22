class MagicIndex{
	
	public static int getMagic(int[] Arr,start,end)
	{
		int mid = (start+end)/2;
		//base cases
		if(Arr[mid] == mid)
			return mid;


		if(Arr[mid] > mid)
			//the magic will be on the left
			return getMagic(Arr,start,mid-1);
		else
			return getMagic(Arr,mid+1,end);





	}




	public static void main(String[] args)
	{




	}
	




}