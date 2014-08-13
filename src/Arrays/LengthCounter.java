package Arrays;

public class LengthCounter {
	public static void main (String[] args){
		System.out.println(count(new String[] {"a", "b", "c", "d"}, 1)); // 4
		System.out.println(count(new String[] {"a", "b", "c", "d"}, 2)); // 0
		System.out.println(count(new String[] {"ab", "bbd", "caaasd", "dd"}, 2)); // 2
	}
	
	public static int count(String[] strings, int length){
		if (strings == null || strings.length == 0)
			return 0;
		int count = 0;
		for (String s: strings){
			if (s.length() == length)
				count++;
		}
		return count;
	}
}
