package Sort;

public class MergeSort {
	public static void main(String[] args) {
		int[] unsortedArray = getRandomArray(); // implemented in step 1.
		sort(unsortedArray); // implemented in step 2.

		// print out sorted array
		for (int i = 0; i < unsortedArray.length; i++)
			System.out.println(unsortedArray[i]);
	}

	private static int[] getRandomArray() {
		int[] result = new int[1000];
		for (int i = 0; i < 1000; i++) {
			result[i] = (int) (Math.random() * 1001);
		}
		return result;
	}

	//Wrapper method to set up the merging
	private static void sort(int[] unsorted) {
		int length = unsorted.length;
		mergeSort(0, length - 1, unsorted);
	}
	
	//Breaks up the array into smaller arrays before sorting
	private static void mergeSort(int lo, int hi, int[] unsorted) {
		// if lo >= hi, the array is sorted and we're done.
		if (lo < hi) {
			// break up the array into left and right
			// after they are fully broken up, merge them
			// into a sorted array.
			int mid = lo + (hi - lo) / 2;
			mergeSort(lo, mid, unsorted);
			mergeSort(mid + 1, hi, unsorted);
			merge(lo, mid, hi, unsorted);
		}
	}

	//Merges values into the input array in ascending order
	private static void merge(int lo, int mid, int hi, int[] unsorted) {
		int[] helper = new int[unsorted.length];
		// Copy input to an array that will help us merge the values.
		for (int i = lo; i <= hi; i++) {
			helper[i] = unsorted[i];
		}
		
		// a, b and c are ints that will merge the data from the
		// helper array to the input array
		int a = lo; // Keeps track of lo position in helper array
		int b = mid + 1; // Keeps track of hi position in helper array
		int c = lo; // Keeps track of position to insert value in input array.
		
		while (a <= mid && b <= hi) {
			if (helper[a] <= helper[b]) {
				unsorted[c] = helper[a];
				a++;
			} else {
				unsorted[c] = helper[b];
				b++;
			}
			c++;
		}
		// Copy the leftover values
		while (a <= mid) {
			unsorted[c] = helper[a];
			c++;
			a++;
		}
	}
}