package Strings;

public class FirstLast {
	public static void main(String[] args){
		System.out.println(getFirstAndLast("JavaProbs", 2));
		System.out.println(getFirstAndLast("JavaProbs", 4));
		System.out.println(getFirstAndLast("HelloWorld", 10));
	}
	
	public static String getFirstAndLast(String s, int n){
		// if the given string is null, blank, or the count is
		// greater than the length of the string, return a blank string
		if (s == null || s.length() == 0 || n > s.length())
			return "";
		
		//get the first n characters
		String result = s.substring(0, n);
		
		//get the last n characters
		result += s.substring(s.length() - n);
		
		//return the result
		return result;
	}
}