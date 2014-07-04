package Strings;

import java.util.HashMap;

public class FirstNonRepeated {
	public static void main(String[] args){
		System.out.println(firstNonRepeated("asdfasdfasdfasdfjasdfasdf")); //j
		System.out.println(firstNonRepeated("javaprobs")); //j
		System.out.println(firstNonRepeated("twitter")); //w
		System.out.println(firstNonRepeated("aaaaaaabbbbbbbccccccdaaaaaafffff")); //d
		System.out.println(firstNonRepeated("asdfasdf")); //*
		System.out.println(firstNonRepeated("")); //*
	}
	
	public static char firstNonRepeated(String input){
		HashMap<Character, Integer> charCounts = new HashMap<Character,Integer>();
		int length = input.length(); //store length so we don't call .length() every time.
		
		//Store the how many times each character appears.
		for (int i = 0; i < length; i++){
			if (!charCounts.containsKey(input.charAt(i)))
				charCounts.put(input.charAt(i), 1);
			else
				charCounts.put(input.charAt(i), charCounts.get(input.charAt(i)) + 1);
		}
		
		//Loop through each character, return the first with a value of 1.
		for (int i = 0 ; i < length; i++){
			if (charCounts.get(input.charAt(i)) == 1)
				return input.charAt(i);
		}
		
		//return * if not found.
		return '*';
	}
}
