package ProjectEuler;

import java.util.ArrayList;
import java.util.List;

public class ProjectEuler4 {
	int count;
	public static void main(String[] args){
		//Declare a holder for all our palindromes.
		List<Integer> palindromes = new ArrayList<Integer>();
		
		//Loop through all 3 digit products
		for (int i = 999; i > 100; i--)
		{
			for (int j = 999; j > 100; j--)
			{
				//Check if product is a palindrome
				//If so, add it to the list.
				if (isPalindrome(i*j))
				{
					palindromes.add(i*j);
				}
			}
		}
		
		//Traverse through our list to find the maximum
		int max = 0;
		for (int i: palindromes)
		{
			if (i > max)
				max = i;
		}
		
		//Print solution
		System.out.println(max);
	}
	
	//Helper method to determine if the product is a palindrome.
	private static boolean isPalindrome(int i)
	{
		String s = ""+i;
		int first = 0;
		int last = s.length()-1;
		while (first <= last)
		{
			if (s.charAt(first) != s.charAt(last))
			{
				return false;
			}
			first ++; last --;
		}
		return true;
	}
}