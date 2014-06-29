package Strings;

public class AllPermutations {
	public static void main(String[] args) {
		printAllPermutations("ABCD");
	}

	public static void printAllPermutations(String s) {
		StringBuilder sb = new StringBuilder();
		boolean[] used = new boolean[s.length()];
		printAll(s, 0, used, sb);
	}

	public static void printAll(String input, int pos, boolean[] used, StringBuilder sb){
		if (pos == input.length()){
			System.out.println(sb.toString());
			return;
		}
		for (int i = 0; i < input.length(); i++){
			//If the character has already been used, don't append it.
			if (used[i])
				continue;
			
			used[i] = true;
			sb.append(input.charAt(i)); //append char to string builder
			printAll(input, pos + 1, used, sb); //recursive call
			sb.setLength(sb.toString().length() - 1); //remove last char
			used[i] = false;
		}
	}
}