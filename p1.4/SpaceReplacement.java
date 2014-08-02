import java.util.*;



class SpaceReplacement
{
	

public static void Replacement(char[] word,int length)
{
	int spaceCount = 0;
	int newLength = 0;
	for(int i =0;i < length ; i++)
	{
		if(word[i] == ' ') spaceCount++;
	}

	newLength = length + spaceCount*2 ;
	word[newLength] = '\0';
	for(int i = length-1; i>= 0 ; i--)
	{
		if(word[i] == ' ')
		{
			word[newLength - 1] = '0';
			word[newLength - 2] = '2';
			word[newLength - 3] = '%';
			newLength = newLength -3 ;
		}	
		else
		{
			word[newLength - 1] = word[i] ;
			newLength = newLength -1 ;
		}

	} 
	
}

public static void main(String[] args)
{
	String word = "Mr John Smith     " ; 
	int length = 13;
	System.out.println("input :" + word + "," + length);
	char[] input = word.toCharArray();
	System.out.println(input.length);
	Replacement(input,length);
	System.out.println("output :" + word);
}
}