package Arrays;

//http://community.topcoder.com/stat?c=problem_statement&pm=13195

import java.util.Arrays;

public class CostOfDancing {
	public static void main(String[] args){
		System.out.println(minimum(2, new int[] {1,5,3,4}));
		System.out.println(minimum(3, new int[] {1,5,4}));
		System.out.println(minimum(1, new int[] {2,2,4,5,3}));
		System.out.println(minimum(39, new int[] {973, 793, 722, 
			573, 521, 568, 845, 674, 595, 310, 284, 794, 
			913, 93, 129, 758, 108, 433, 181, 163, 96, 932,
			703, 989, 884, 420, 615, 991, 364, 657, 421, 336, 
			801, 142, 908, 321, 709, 752, 346, 656, 413, 629, 801}));
	}
	
	public static int minimum (int k, int[] danceCost){
		Arrays.sort(danceCost);
		int sum = 0;
		for (int i = 0; i < k; i++){
			sum += danceCost[i];
		}
		return sum;
	}
}
