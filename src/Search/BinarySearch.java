package Search;

public class BinarySearch {
	public static final int NOT_FOUND = -1;
	
	public int searchRecursive(int[] sorted, int toBeFound){
		return binarySearchRecursive(0, sorted.length - 1, sorted, toBeFound);
	}
	
	private int binarySearchRecursive(int lo, int hi, int[] sorted, int toBeFound){
		// if lo > hi, we know we haven't found the item.
		if (lo > hi)
			return NOT_FOUND;
		int mid = (lo + hi) / 2;
		
		//See if toBeFound is in lo, mid, or hi.
		if (sorted[lo] == toBeFound)
			return lo;
		if (sorted[mid] == toBeFound)
			return mid;
		if (sorted[hi] == toBeFound)
			return hi;
		
		if (toBeFound > sorted[mid]){
			//If toBeFound > sorted[mid], we can get rid of
			//everything in the array below mid.  
			return binarySearchRecursive(mid+1, hi, sorted, toBeFound);
		}
		else{
			//Get rid of everything in array above mid.
			return binarySearchRecursive(lo, mid-1, sorted, toBeFound);
		}
	}
	
	public int searchIterative(int[] sorted, int toBeFound){
		int lo = 0;
		int hi = sorted.length - 1;
		int mid = (lo + hi) / 2;
		while (lo < hi){
			mid = (lo + hi) / 2;
			
			//See if toBeFound is in lo, mid, or hi.
			if (sorted[lo] == toBeFound)
				return lo;
			if (sorted[mid] == toBeFound)
				return mid;
			if (sorted[hi] == toBeFound)
				return hi;
			
			if (toBeFound > sorted[mid]){
				//If toBeFound > sorted[mid], we can get rid of
				//everything in the array below mid.  
				lo = mid + 1;
			}
			else{
				//Get rid of everything in array above mid.
				hi = mid - 1;
			}
		}
		//If we made it all the way through the while looop, we did
		//not find the item, and it is not in int[] sorted.
		return NOT_FOUND;
	}
}
