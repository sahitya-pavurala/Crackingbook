import java.util.*;

class ArrayMerge
{


	public static void main(String[] args)
	{
		int[] a = {1,26,45,61,0,0,0,0,0};
		int[] b = {23,54,78,98};
		int[] result = mergeArray(a,b);
		System.out.println("The array after merging is");
		for(int i : result)
		{	
			if(i!=0)
			System.out.println(i);
		}
	}

	public static int[] mergeArray(int[] a, int[] b)
	{
		
		int aindex = 0;
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] == 0)
			{
				aindex = i-1;
				break;
			}

		}
		//int aindex = a.length-1;
		int bindex = b.length-1;
		int newindex = aindex + bindex +1 ;

		while(aindex >= 0 && bindex >= 0)
		{
			if(a[aindex] > b[bindex])
				a[newindex--] = a[aindex--];
			else
				a[newindex--] = b[bindex--];
		}
		
		while(aindex >= 0)
		{
			a[newindex--] = a[aindex--];
		}
	
		return a;
		
	}
}