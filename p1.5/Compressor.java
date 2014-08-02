import java.util.*;




class Compressor
{


	public String Compress(String word)
	{
		int compressedSize = wordLength(word);
		if (compressedSize >= word.length()) return word;
		else
		{
			StringBuilder compressedString = new StringBuilder();
			char first = word.charAt(0);
			compressedString.append(first);
			int j = 1 ;
			int count = 1 ;
			for(int i = j ; i < word.length() ; i++)
			{
				if(word.charAt(i) == first) count++ ;
				else
				{
					j = i + 1 ;
					compressedString.append(count);
					compressedString.append(word.charAt(i));
					first = word.charAt(i);
					count = 1 ; 
				}
				
			}
			compressedString.append(count);
			return compressedString.toString();
		} 
			
	}

	public int wordLength(String word)
	{
		int size = 0 ;
		int count = 1 ;
		int j = 1 ;
		char first = word.charAt(0);
		for(int i = j ; i < word.length() ; i++)
		{
			if(word.charAt(i) == first) count++;
			else
			{
				j = i + 1 ; 
				first = word.charAt(i);
				size += 1 + String.valueOf(count).length() ;
				count = 1 ;

			}

		}
		size += 1 + String.valueOf(count).length() ;
		return size;
	}

	public static void main(String[] args)
	{
		String input = args[0];
		Compressor ob = new Compressor();
		String output = ob.Compress(input);
		System.out.println("The input is :" + input);
		System.out.println("The compressedString is :" + output);

	}
}