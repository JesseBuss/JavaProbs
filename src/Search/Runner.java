package Search;

public class Runner {
	public static void main(String[] args){
		BinarySearch binarySearch = new BinarySearch();
		int[] sorted = new int[1000];
		for (int i = 0; i < 1000; i++){
			sorted[i] = i*2;
		}
		//Recursive search test
		System.out.println(binarySearch.searchRecursive(sorted, 8));
		System.out.println(binarySearch.searchRecursive(sorted, 998));
		System.out.println(binarySearch.searchRecursive(sorted, 7));
		System.out.println(binarySearch.searchRecursive(sorted, 668));
		System.out.println(binarySearch.searchRecursive(sorted, 224));
		System.out.println(binarySearch.searchRecursive(sorted, -18));
		System.out.println(binarySearch.searchRecursive(sorted, 44444));
		System.out.println(binarySearch.searchRecursive(sorted, 0));
		System.out.println(binarySearch.searchRecursive(sorted, 1000));
		System.out.println(binarySearch.searchRecursive(sorted, 16));
		
		//Iterative search test
		System.out.println(binarySearch.searchIterative(sorted, 8));
		System.out.println(binarySearch.searchIterative(sorted, 998));
		System.out.println(binarySearch.searchIterative(sorted, 7));
		System.out.println(binarySearch.searchIterative(sorted, 668));
		System.out.println(binarySearch.searchIterative(sorted, 224));
		System.out.println(binarySearch.searchIterative(sorted, -18));
		System.out.println(binarySearch.searchIterative(sorted, 44444));
		System.out.println(binarySearch.searchIterative(sorted, 0));
		System.out.println(binarySearch.searchIterative(sorted, 1000));
		System.out.println(binarySearch.searchIterative(sorted, 16));
	}
}
