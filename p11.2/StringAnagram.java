import java.util.*;


class StringAnagram implements Comparator<String>
{
	public static String sortChars(String input)
	{
		char[] charArr = input.toCharArray();
		Arrays.sort(charArr);
		//return charArr.toString();
		return new String(charArr);
	}

	public int compare(String a , String b)
	{
		return sortChars(a).compareTo(sortChars(b));
	}


	public static void main(String[] args)
	{
		String[] input = {"sai","ias","vap","pav","mod","ding","god","dog"};
		Arrays.sort(input, new StringAnagram());
		for(String word : input)
			System.out.println(word);
	}
}

