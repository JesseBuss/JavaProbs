package Strings;

public class GetParenthesis {
	public static void main(String[] args){
		System.out.println(getParenthesisString("(Java)aeuuw"));
		System.out.println(getParenthesisString("aseraa(probs)"));
		System.out.println(getParenthesisString("asdfas(Javaprobs)aeuuw"));
	}
	
	public static String getParenthesisString(String str){
		  return str.substring(str.indexOf('(') + 1, str.indexOf(')'));
	}
}
