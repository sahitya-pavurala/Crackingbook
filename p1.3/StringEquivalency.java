import java.util.*;

class StringEquivalency
{
	public boolean comparator(String first, String second)
	{
		if(first.length() != second.length())
			return false;

		if(first == second)
			return true;

		char[] firstArray = first.toCharArray();
		Arrays.sort(firstArray);
		char[] secondArray = second.toCharArray();
		Arrays.sort(secondArray);

		String check1 = new String(firstArray);
		String check2 = new String(secondArray);

		if(!(check1.equals(check2)))
			return false;
	
		return true;
	}



	public static void main(String[] args)
	{
		StringEquivalency obj = new StringEquivalency();
		String first = args[0];
		String second = args[1];
		if (obj.comparator(first,second))

			System.out.println("One String is the permutation of the other");
		else
			System.out.println("They are two different Strings");

	}
}