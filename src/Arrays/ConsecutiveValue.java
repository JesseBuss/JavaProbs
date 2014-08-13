package Arrays;

public class ConsecutiveValue {
	public static void main(String[] args){
		System.out.println(hasConsecutive(new int[] {1,40,40,40,800,260}, 40)); // true
		System.out.println(hasConsecutive(new int[] {1,40,40,40,800,260}, 600)); // false
		System.out.println(hasConsecutive(new int[] {1,40,80,40,800,260}, 40)); // false
		System.out.println(hasConsecutive(new int[] {1,80,40,40,800,260}, 40)); // true
		System.out.println(hasConsecutive(new int[] {}, 600)); // false
		System.out.println(hasConsecutive(new int[] {600}, 600)); // false
	}
	
	public static boolean hasConsecutive(int[] array, int i){
		if (array == null || array.length < 2)
			return false;
		for (int j = 1; j < array.length; j++){
			if (array[j] == i && array[j-1] == i)
				return true;
		}
		return false;
	}
}
