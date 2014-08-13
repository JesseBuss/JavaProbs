package Arrays;

public class SortedArray {
	public static void main(String[] args){
		System.out.println(isSorted(new int[] {1,2,4,8})); // true
		System.out.println(isSorted(new int[] {1,9,4,8})); // false
		System.out.println(isSorted(new int[] {1})); // true
		System.out.println(isSorted(new int[] {})); // true
		System.out.println(isSorted(new int[] {48,123,4,5,2,61,23,41,512})); // false
		System.out.println(isSorted(new int[] {1,2,40000,8})); // false
	}
	
	public static boolean isSorted(int[] array){
		if (array == null || array.length < 2)
			return true;
		for (int i = 1; i < array.length; i++){
			if (array[i] < array[i-1])
				return false;
		}
		return true;
	}
}
