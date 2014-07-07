package Strings;

import java.util.HashMap;

public class AllUniqueChars {
	public static void main(String[] args){
		System.out.println(isAllUnique("asdf")); // true
		System.out.println(isAllUnique("asdfa")); // false
		System.out.println(isAllUnique("javaprobs")); //false
		System.out.println(isAllUnique("abcdefghijklmnopqrstuvwxyz")); //true;
	}
	
	public static boolean isAllUnique(String input){
		HashMap<Character, Boolean> chars = new HashMap<Character, Boolean>();
		int length = input.length();
		
		for (int i = 0; i < input.length(); i++){
			if (chars.containsKey(input.charAt(i)))
				return false; // We've already seen this character
			else
				chars.put(input.charAt(i), true);
		}
		
		//We traversed the whole string without hitting a duplicate
		//character, must be all unique.
		return true;
	}
}
