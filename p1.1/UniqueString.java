import java.util.*;


class UniqueString {

	public static boolean comparator(String word){
		if (word.length() > 256)  
			return false;

		boolean[] checker = new boolean[256];
		for(int i = 0 ; i < word.length() ; i++){

			int val = word.charAt(i);
			if (checker[val])
				return false;
			checker[val] = true;
		}
		return true;
	}

	public static void main(String[] args){

		String word = args[0];
		boolean result = comparator(word);
		if(result)
		System.out.println("The characters are Unique");
		else
		System.out.println("The characters are not Unique");
	}	
}