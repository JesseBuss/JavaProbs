package Sort;

public class BubbleSort {
	public static void main(String [] args){
		int[] unsortedArray = getRandomArray(); // implemented in step 1.
		bubbleSort(unsortedArray); // implemented in step 2.
		
		//print out sorted array
		for (int i = 0; i < unsortedArray.length; i++)
			System.out.println(unsortedArray[i]);
	}
	
	private static int[] getRandomArray(){
		int[] result = new int[1000];
		for (int i = 0; i < 1000; i++){
			result[i] = (int)(Math.random() * 1001);
		}
		return result;
	}
	
	private static void bubbleSort(int[] unsorted){
		int length = unsorted.length;
		
		boolean isSorted = false;
		while (!isSorted){
			isSorted = true;
			for (int i = 1; i < length; i++){
				if (unsorted[i] < unsorted[i-1]){
					//swap values
					int temp = unsorted[i];
					unsorted[i] = unsorted[i-1];
					unsorted[i-1] = temp;
					
					//since we made a swap, the list may not be sorted
					isSorted = false;
				}
			}
		}
	}
}
